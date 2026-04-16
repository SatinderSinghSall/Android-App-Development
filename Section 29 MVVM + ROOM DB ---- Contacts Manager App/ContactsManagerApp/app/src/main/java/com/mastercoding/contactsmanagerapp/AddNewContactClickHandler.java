package com.mastercoding.contactsmanagerapp;

import android.view.View;
import android.widget.Toast;

public class AddNewContactClickHandler {

    AddNewContactActivity activity;

    public AddNewContactClickHandler(AddNewContactActivity activity){
        this.activity = activity;
    }

    public void onAddButtonClicked(View view){
        Toast.makeText(activity,"Add Button Clicked",Toast.LENGTH_SHORT).show();
    }

}