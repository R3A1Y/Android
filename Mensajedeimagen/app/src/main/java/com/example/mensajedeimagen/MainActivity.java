package com.example.mensajedeimagen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageButton main_imagenbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_imagenbutton = (ImageButton) (findViewById(R.id.main_imagenbutton));
        main_imagenbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String a = "Hermoso";
                Toast.makeText(getApplicationContext(),a,Toast.LENGTH_LONG).show();
            }
        });
    }
}