package com.example.recyclerviewjava;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactsRecView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactsRecView = findViewById(R.id.contactsRecView);
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Marcos","marcos@gmail.com","https://cdn.pixabay.com/photo/2019/10/22/13/43/black-male-4568761__340.jpg"));
        contacts.add(new Contact("Ju","juliana@gmail.com","https://cdn.pixabay.com/photo/2020/09/19/12/49/woman-5584374__340.jpg"));

        ContactsRecViewAdapter adapter = new ContactsRecViewAdapter(this);
        adapter.setContacts(contacts);

        contactsRecView.setAdapter(adapter);
        contactsRecView.setLayoutManager(new LinearLayoutManager(this));
    }
}