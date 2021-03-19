package com.example.frutas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView main_listview;
    ArrayList<String> frutas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_listview = findViewById(R.id.main_listview);
        frutas = new ArrayList<>();
        frutas.add("manzana");
        frutas.add("pera");
        frutas.add("melocoton");
        frutas.add("melon");
        frutas.add("sandia");
        frutas.add("fresa");
        frutas.add("uva");
        ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,frutas);
        main_listview.setAdapter(a);

    }
}