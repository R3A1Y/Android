package com.example.datospersonales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText main_edittext, main_edittextmulti;
    Button main_button, main_button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_edittext = findViewById(R.id.main_edittext);
        main_edittextmulti = findViewById(R.id.main_edittextmulti);
        main_button = findViewById(R.id.main_button);
        main_button2 = findViewById(R.id.main_button2);


    }
    public void grabar(View v) {
        String nombre=main_edittext.getText().toString();
        String datos=main_edittextmulti.getText().toString();
        SharedPreferences preferencias=getSharedPreferences("agenda",
                Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString(nombre, datos);
        editor.commit();
        Toast.makeText(this,"Datos grabados", Toast.LENGTH_LONG).show();
    }
    public void recuperar(View v) {
        String nombre=main_edittext.getText().toString();
        SharedPreferences prefe=getSharedPreferences("agenda", Context.MODE_PRIVATE);
        String d=prefe.getString(nombre, "");
        if (d.length()==0) {
            Toast.makeText(this,"No existe dicho nombre en la agenda",
                    Toast.LENGTH_LONG).show();
        }
        else {
            main_edittextmulti.setText(d);
        }
    }
}
