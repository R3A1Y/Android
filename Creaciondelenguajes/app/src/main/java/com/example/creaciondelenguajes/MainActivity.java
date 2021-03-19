package com.example.creaciondelenguajes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView main_listview;
    ArrayList<String> arrayList;
    String[] info = {"1994 por Perl", "1995 por James Gosling","2009 por Google.", "2010 por JetBrains", "1995 Netscape Communications, Fundación Mozilla", "2000 por Microsoft", "1991 por Microsoft"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_listview = findViewById(R.id.main_listview);

        arrayList = new ArrayList<String>();
        arrayList.add("PHP");
        arrayList.add("Java");
        arrayList.add("Go");
        arrayList.add("Kotlin");
        arrayList.add("JavaScript");
        arrayList.add("CSharp");
        arrayList.add("Visual Basic");

        ArrayAdapter<String> a = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrayList);
        main_listview.setAdapter(a);
        main_listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"En " +info[position], Toast.LENGTH_LONG).show();
                return false;
            }
        });

    }
}