package com.example.mayoromenor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView main_textview;
    EditText main_edittext, main_edittext2;
    Button main_button, main_button_borrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_textview = findViewById(R.id.main_textView);
        main_edittext = findViewById(R.id.main_edittext);
        main_edittext2 = findViewById(R.id.main_edittext2);
        main_button = findViewById(R.id.main_button);
        main_button_borrar = findViewById(R.id.main_button_borrar);

    }
    public void onClick(View v)
    {
        int a = Integer.parseInt(main_edittext.getText().toString());
        int b = Integer.parseInt(main_edittext2.getText().toString());
        if (a > b)
        {
            main_textview.setText("<-");
        }
        if (b > a)
        {
            main_textview.setText("->");
        }
    }
    public void BORRAR(View v)
    {
        main_edittext.setText(" ");
        main_edittext2.setText(" ");
        main_textview.setText("0");
    }
}