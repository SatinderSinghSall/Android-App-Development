package com.example.contactsmanagerapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import com.example.contactsmanagerapp.databinding.ActivityAddNewContactBinding;

public class AddNewContactActivity extends AppCompatActivity {

    private ActivityAddNewContactBinding addNewContactBinding;
    private AddNewContactClickHandler clickHandler;
    private Contacts contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addNewContactBinding =
                DataBindingUtil.setContentView(this, R.layout.activity_add_new_contact);

        contacts = new Contacts();

        MyViewModel viewModel =
                new ViewModelProvider(this).get(MyViewModel.class);

        clickHandler =
                new AddNewContactClickHandler(contacts, this, viewModel);

        addNewContactBinding.setContact(contacts);
        addNewContactBinding.setClickHandler(clickHandler);

        // Back button
        addNewContactBinding.backBtn.setOnClickListener(v -> finish());
    }
}
