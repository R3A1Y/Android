package com.example.paises;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView main_listview;
    TextView main_textview;
    ArrayList<String> paises;
    String[] habitantes = {"10 954 506","2 891 935", "11 521 061", "11 349 644", "128 230 000", "8 550 000", "28 515 829"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_listview = findViewById(R.id.main_listview);
        main_textview = findViewById(R.id.main_textview);
        paises = new ArrayList<>();
        paises.add("Republica Dominicana");
        paises.add("Puerto Rico");
        paises.add("Haiti");
        paises.add("Cuba");
        paises.add("Mexico");
        paises.add("New York");
        paises.add("Venezuela");
        ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,paises);
        main_listview.setAdapter(a);
        main_listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                main_textview.setText(a.getItem(position)+" Tiene "+ habitantes[position]+" Habitantes ");
            }
        });
    }


}