package com.example.contactsmanagerapp;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.contactsmanagerapp.databinding.ContactListItemBinding;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ContactViewHolder> {

    private ArrayList<Contacts> contacts;

    private OnContactClickListener listener;

    public interface OnContactClickListener {
        void onContactClick(Contacts contact);
    }

    public MyAdapter(ArrayList<Contacts> contacts, OnContactClickListener listener) {
        this.contacts = contacts;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        ContactListItemBinding binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.getContext()),
                R.layout.contact_list_item,
                parent,
                false
        );

        return new ContactViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactViewHolder holder, int position) {

        Contacts currentContact = contacts.get(position);

        holder.contactListItemBinding.setContact(currentContact);

        holder.itemView.setOnClickListener(v -> {
            if (listener != null) {
                listener.onContactClick(currentContact);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (contacts != null) {
            return contacts.size();
        } else {
            return 0;
        }
    }

    public void setContacts(ArrayList<Contacts> contacts) {
        this.contacts = contacts;
        notifyDataSetChanged();
    }

    public Contacts getContactAt(int position) {
        return contacts.get(position);
    }

    class ContactViewHolder extends RecyclerView.ViewHolder {

        private ContactListItemBinding contactListItemBinding;

        public ContactViewHolder(@NonNull ContactListItemBinding binding) {
            super(binding.getRoot());
            this.contactListItemBinding = binding;
        }
    }
}
