package com.example.contactsmanagerapp;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface ContactDAO {
    @Insert
    void insert(Contacts contacts);
    @Delete
    void delete(Contacts contacts);

    @Query("SELECT * FROM Contacts_Table")
    List<Contacts> getAllContacts();
}
