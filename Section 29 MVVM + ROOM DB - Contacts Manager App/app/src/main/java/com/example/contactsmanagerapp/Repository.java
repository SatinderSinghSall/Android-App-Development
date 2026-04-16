package com.example.contactsmanagerapp;

import android.os.Handler;
import android.os.Looper;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Repository {
    private final ContactDAO contactDAO;
    public ExecutorService executor;
    public Handler handler;

    public Repository(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;

        executor = Executors.newSingleThreadExecutor();
        handler = new Handler(Looper.getMainLooper());
    }

    public void addContact(Contacts contact) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.insert(contact);
            }
        });
    }

    public void deleteContact(Contacts contact) {
        executor.execute(new Runnable() {
            @Override
            public void run() {
                contactDAO.delete(contact);
            }
        });
    }

    public void getAllContacts(Callback callback) {
        executor.execute(() -> {
            List<Contacts> list = contactDAO.getAllContacts();
            handler.post(() -> callback.onResult(list));
        });
    }

    public interface Callback {
        void onResult(List<Contacts> contacts);
    }
}
