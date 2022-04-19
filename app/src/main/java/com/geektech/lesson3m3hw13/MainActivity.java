package com.geektech.lesson3m3hw13;


import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<String> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recycler_view);
        loadData();
        ContactAdapter adapter = new ContactAdapter(contacts);
        recyclerView.setAdapter(adapter);

    }

    private void loadData(){
        contacts = new ArrayList<>();
        contacts.add("+996 555 555666");
        contacts.add("+996 551 555777");
        contacts.add("+996 550 666555");
        contacts.add("+996 557 888555");
        contacts.add("+996 500 555555");
        contacts.add("+996 700 555555");
        contacts.add("+996 999 555555");
        contacts.add("+996 777 555555");
        contacts.add("+996 552 555555");
        contacts.add("+996 705 555555");
        contacts.add("+996 996 555555");
        contacts.add("+996 556 555555");
        contacts.add("+996 554 555555");
    }
}