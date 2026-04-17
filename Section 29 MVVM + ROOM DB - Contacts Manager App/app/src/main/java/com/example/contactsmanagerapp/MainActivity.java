package com.example.contactsmanagerapp;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsmanagerapp.databinding.ActivityMainBinding;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ContactDatabase contactDatabase;
    ArrayList<Contacts> contactsArrayList = new ArrayList<>();

    private MyAdapter myAdapter;

    private ActivityMainBinding mainBinding;
    private MainActivityClickHandlers clickHandlers;
    private MyViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        clickHandlers = new MainActivityClickHandlers(this);

        mainBinding.setClickHandler(clickHandlers);

        RecyclerView recyclerView = mainBinding.recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);

        contactDatabase = ContactDatabase.getInstance(this);

        MyViewModel viewModel = new ViewModelProvider(this).get(MyViewModel.class);

//        Contacts c1 = new Contacts("John Smith", "john.c.breckinridge@altostrat.com");
//        Contacts c2 = new Contacts("Jane Doe", "james.monroe@examplepetstore.com");
//        Contacts c3 = new Contacts("Bob Johnson", "john.jay@example.com");
//        Contacts c4 = new Contacts("Alice Williams", "william.r.king@my-own");
//        Contacts c5 = new Contacts("David Lee", "william.orville.douglas@example-pet-store.");
//
//        viewModel.addNewContact(c1);
//        viewModel.addNewContact(c2);
//        viewModel.addNewContact(c3);
//        viewModel.addNewContact(c4);
//        viewModel.addNewContact(c5);

        viewModel.getAllContacts().observe(this, new Observer<List<Contacts>>() {
            @Override
            public void onChanged(List<Contacts> contacts) {
                contactsArrayList.clear();

                for (Contacts contact : contacts) {
                    Log.v("TAGY", contact.getName());
                    contactsArrayList.add(contact);
                }

                myAdapter.notifyDataSetChanged();
            }
        });

        myAdapter = new MyAdapter(contactsArrayList, contact -> {
            showContactModal(contact);
        });

        recyclerView.setAdapter(myAdapter);

        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(
                new ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.LEFT | ItemTouchHelper.RIGHT) {

                    @Override
                    public boolean onMove(RecyclerView recyclerView,
                                          RecyclerView.ViewHolder viewHolder,
                                          RecyclerView.ViewHolder target) {
                        return false;
                    }

                    @Override
                    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {

                        Contacts contactToDelete =
                                myAdapter.getContactAt(viewHolder.getAdapterPosition());

                        viewModel.deleteContact(contactToDelete);
                    }
                });

        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    private void showContactModal(Contacts contact) {

        BottomSheetDialog dialog = new BottomSheetDialog(this);

        View view = getLayoutInflater().inflate(R.layout.contact_detail_modal, null);

        TextView name = view.findViewById(R.id.modalName);
        TextView email = view.findViewById(R.id.modalEmail);
        TextView avatar = view.findViewById(R.id.modalAvatar);

        name.setText(contact.getName());
        email.setText(contact.getEmail());
        avatar.setText(contact.getName().substring(0,1));

        view.findViewById(R.id.editButton).setOnClickListener(v ->
                Toast.makeText(this, "Edit feature in development", Toast.LENGTH_SHORT).show()
        );

        view.findViewById(R.id.deleteButton).setOnClickListener(v -> {

            dialog.dismiss();

            showDeleteDialog(contact);
        });

        dialog.setContentView(view);
        dialog.show();
    }

    private void showDeleteDialog(Contacts contact) {

        Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_delete_contact);

        TextView message = dialog.findViewById(R.id.deleteMessage);

        message.setText("Delete " + contact.getName() + "?");

        dialog.findViewById(R.id.cancelButton).setOnClickListener(v -> {
            dialog.dismiss();
        });

        dialog.findViewById(R.id.confirmDeleteButton).setOnClickListener(v -> {

            viewModel.deleteContact(contact);

            Toast.makeText(this, "Contact deleted", Toast.LENGTH_SHORT).show();

            dialog.dismiss();
        });

        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);

        dialog.show();

        dialog.getWindow().setLayout(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        );
    }
}
