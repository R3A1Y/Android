package com.example.email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText main_edittext;
    Button main_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_edittext = findViewById(R.id.main_edittext);
        main_button = findViewById(R.id.main_button);

        SharedPreferences prefe=getSharedPreferences("datos", Context.MODE_PRIVATE);
        main_edittext.setText(prefe.getString("mail",""));
    }
    public void ejecutar(View v)
    {
        SharedPreferences preferencias=getSharedPreferences("datos",Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=preferencias.edit();
        editor.putString("mail", main_edittext.getText().toString());
        editor.commit();
        finish();
    }
}