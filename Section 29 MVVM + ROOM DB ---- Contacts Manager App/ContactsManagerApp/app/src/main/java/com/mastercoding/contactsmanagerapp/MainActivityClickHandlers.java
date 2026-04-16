package com.mastercoding.contactsmanagerapp;

import android.content.Intent;
import android.view.View;

public class MainActivityClickHandlers {

    MainActivity activity;

    public MainActivityClickHandlers(MainActivity activity){
        this.activity = activity;
    }

    public void onFabClicked(View view){

        Intent intent = new Intent(activity, AddNewContactActivity.class);
        activity.startActivity(intent);

    }
}
