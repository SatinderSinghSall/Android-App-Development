package com.example.contactsmanagerapp;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.Toast;

public class AddNewContactClickHandler {

    private Contacts contacts;
    private Context context;
    private MyViewModel viewModel;

    public AddNewContactClickHandler(Contacts contacts, Context context, MyViewModel viewModel) {
        this.contacts = contacts;
        this.context = context;
        this.viewModel = viewModel;
    }

    public void onSubmitButtonClick(View view) {

        if (contacts.getName() == null || contacts.getName().isEmpty()) {
            Toast.makeText(context, "Please enter a name", Toast.LENGTH_SHORT).show();
            return;
        }

        if (contacts.getEmail() == null || contacts.getEmail().isEmpty()) {
            Toast.makeText(context, "Please enter an email", Toast.LENGTH_SHORT).show();
            return;
        }

        viewModel.addNewContact(contacts);

        Toast.makeText(context, "Contact saved!", Toast.LENGTH_SHORT).show();

        ((AddNewContactActivity) context).finish();
    }
}
