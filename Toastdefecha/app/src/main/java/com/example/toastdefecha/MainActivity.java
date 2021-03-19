package com.example.toastdefecha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner main_spinner;
    Button main_button;
    String[] years ={"1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1998", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008",
            "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_spinner = (Spinner) findViewById(R.id.main_spinner);
        main_button = (Button) findViewById(R.id.main_button);
        main_spinner.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item,years));
        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (String y: years){
                    if (main_spinner.getSelectedItem()==y){
                        Toast.makeText(getApplicationContext(), y, Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}