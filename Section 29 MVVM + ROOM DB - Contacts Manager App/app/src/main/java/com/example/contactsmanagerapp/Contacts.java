package com.example.contactsmanagerapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "Contacts_Table")
public class Contacts {
    @ColumnInfo(name = "Contact_Id")
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Contact_Name")
    private String name;

    @ColumnInfo(name = "Contact_Email")
    private String email;

    public Contacts(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Contacts() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
