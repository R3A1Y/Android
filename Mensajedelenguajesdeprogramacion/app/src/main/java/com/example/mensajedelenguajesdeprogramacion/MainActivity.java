package com.example.mensajedelenguajesdeprogramacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button main_button;
    CheckBox main_checkbox, main_checkbox2, main_checkbox3, main_checkbox4, main_checkbox5, main_checkbox6, main_checkbox7, main_checkbox8, main_checkbox9, main_checkbox10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_button = (Button) findViewById(R.id.main_button);
        main_checkbox = (CheckBox) findViewById(R.id.main_checkbox);
        main_checkbox2 = (CheckBox) findViewById(R.id.main_checkbox2);
        main_checkbox3 = (CheckBox) findViewById(R.id.main_checkbox3);
        main_checkbox4 = (CheckBox) findViewById(R.id.main_checkbox4);
        main_checkbox5 = (CheckBox) findViewById(R.id.main_checkbox5);
        main_checkbox6 = (CheckBox) findViewById(R.id.main_checkbox6);
        main_checkbox7 = (CheckBox) findViewById(R.id.main_checkbox7);
        main_checkbox8 = (CheckBox) findViewById(R.id.main_checkbox8);
        main_checkbox9 = (CheckBox) findViewById(R.id.main_checkbox9);
        main_checkbox10 = (CheckBox) findViewById(R.id.main_checkbox10);
        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (main_checkbox.isChecked()){
                    String a = "java";
                    Toast.makeText(getApplicationContext(),a,Toast.LENGTH_LONG).show();

                }
                if (main_checkbox2.isChecked()){
                    String b = "JavaScript";
                    Toast.makeText(getApplicationContext(),b,Toast.LENGTH_LONG).show();
                }
                if (main_checkbox3.isChecked()){
                    String c = "Go";
                    Toast.makeText(getApplicationContext(),c,Toast.LENGTH_LONG).show();
                }
                if (main_checkbox4.isChecked()){
                    String d = "Kotlin";
                    Toast.makeText(getApplicationContext(),d,Toast.LENGTH_LONG).show();
                }
                if (main_checkbox5.isChecked()){
                    String e = "Python";
                    Toast.makeText(getApplicationContext(),e,Toast.LENGTH_LONG).show();
                }
                if (main_checkbox6.isChecked()){
                    String f = "Lenguaje C/ C++";
                    Toast.makeText(getApplicationContext(),f,Toast.LENGTH_LONG).show();
                }
                if (main_checkbox7.isChecked()){
                    String g = "Scala";
                    Toast.makeText(getApplicationContext(),g,Toast.LENGTH_LONG).show();
                }
                if (main_checkbox8.isChecked()){
                    String h = "Ruby";
                    Toast.makeText(getApplicationContext(),h,Toast.LENGTH_LONG).show();
                }
                if (main_checkbox9.isChecked()){
                    String i = "Swicht";
                    Toast.makeText(getApplicationContext(),i,Toast.LENGTH_LONG).show();
                }
                if (main_checkbox10.isChecked()){
                    String j = "Dart";
                    Toast.makeText(getApplicationContext(),j,Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}