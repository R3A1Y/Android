package com.example.cambiodemonedas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText main_edit_text;
    TextView main_text_view;
    Button main_button;
    RadioButton main_radion_button, main_radion_button2, main_radion_button3, main_radion_button4, main_radion_button5, main_radion_button6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_edit_text = (EditText) findViewById(R.id.main_edit_text);
        main_text_view = (TextView) findViewById(R.id.main_text_view);
        main_button = (Button) findViewById(R.id.main_button);
        main_radion_button = (RadioButton) findViewById(R.id.main_radion_button);
        main_radion_button2 = (RadioButton) findViewById(R.id.main_radion_button2);
        main_radion_button3 = (RadioButton) findViewById(R.id.main_radion_button3);
        main_radion_button4 = (RadioButton) findViewById(R.id.main_radion_button4);
        main_radion_button5 = (RadioButton) findViewById(R.id.main_radion_button5);
        main_radion_button6 = (RadioButton) findViewById(R.id.main_radion_button6);
        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (main_radion_button.isChecked()){
                    double a = Integer.parseInt(main_edit_text.getText().toString());
                    double c = a * 58.0;
                    main_text_view.setText("El resultado es: "+c);
                }
                else if (main_radion_button2.isChecked()){
                    double a = Integer.parseInt(main_edit_text.getText().toString());
                    double c = a * 68.43;
                    main_text_view.setText("El resultado es: "+c);
                }
                else if (main_radion_button3.isChecked()){
                    double a = Integer.parseInt(main_edit_text.getText().toString());
                    double c = a * 79.68;
                    main_text_view.setText("El resultado es: "+c);
                }
                else if (main_radion_button4.isChecked()){
                    double a = Integer.parseInt(main_edit_text.getText().toString());
                    double c = a * 1.29;
                    main_text_view.setText("El resultado es: "+c);
                }
                else if (main_radion_button5.isChecked()){
                    double a = Integer.parseInt(main_edit_text.getText().toString());
                    double c = a * 151.42;
                    main_text_view.setText("El resultado es: "+c);
                }
                else if (main_radion_button6.isChecked()){
                    double a = Integer.parseInt(main_edit_text.getText().toString());
                    double c = a * 10.77;
                    main_text_view.setText("El resultado es: "+c);
                }
            }
        });

    }
}