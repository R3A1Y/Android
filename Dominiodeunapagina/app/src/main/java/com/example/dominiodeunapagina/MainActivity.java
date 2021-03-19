package com.example.dominiodeunapagina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText main_edittext;
    Button main_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_edittext = (findViewById(R.id.main_edittext));
        main_button = (findViewById(R.id.main_button));
    }
    public void Sendpage (View v){
        Intent intent = new Intent(getApplicationContext(),MainActivity3.class);
        intent.putExtra("pagina", main_edittext.getText().toString());
        startActivity(intent);
    }
}