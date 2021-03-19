package com.example.dominiodeunapagina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    WebView main_webview;
    Button main_button_finalizar;
    Bundle bn;
    String datos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        main_webview = (findViewById(R.id.main_webview));
        main_button_finalizar = (findViewById(R.id.main_button_finalizar));
        bn = getIntent().getExtras();
        datos = bn.getString("pagina");
        main_webview.loadUrl("https://www."+ datos);
    }
    public void cerrar (View v){
        finish();
    }
}
