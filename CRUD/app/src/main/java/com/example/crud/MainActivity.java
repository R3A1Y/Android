package com.example.crud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText id, nombre, cedula;
    Button ingresar, editar, eliminar, buscar_id, cancelar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        id = findViewById(R.id.main_edittext);
        nombre = findViewById(R.id.main_edittext2);
        cedula = findViewById(R.id.main_edittext3);
        ingresar = findViewById(R.id.main_button);
        editar = findViewById(R.id.main_button2);
        eliminar = findViewById(R.id.main_button3);
        buscar_id = findViewById(R.id.main_button4);
        cancelar = findViewById(R.id.main_button5);
    }
    public void Insertar(View v)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String Id = id.getText().toString();
        String Nom = nombre.getText().toString();
        String Ced = cedula.getText().toString();
        ContentValues dates = new ContentValues();
        dates.put("id", Id);
        dates.put("nombre", Nom);
        dates.put("cedula", Ced);
        bd.insert("datos", null,dates);
        bd.close();
        id.setText("");
        nombre.setText("");
        cedula.setText("");
        Toast.makeText(getApplicationContext(), "Se guardaron los datos", Toast.LENGTH_LONG).show();
    }
    public void Editar(View v)
    {
        AdminSQLiteOpenHelper admin = new AdminSQLiteOpenHelper(this, "administration", null, 1);
        SQLiteDatabase bd = admin.getWritableDatabase();
        String Id = id.getText().toString();
        String Nom = nombre.getText().toString();
        String Ced = cedula.getText().toString();
        ContentValues dates = new ContentValues();
        dates.put("id", Id);
        dates.put("nombre", Nom);
        dates.put("cedula", Ced);
        int cant = bd.update("datos", dates, "id=" + Id, null);
        bd.close();
        if (cant == 1)
        {
            Toast.makeText(this, "Se editaron los datos", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "No existe el usuario con el id ingresado", Toast.LENGTH_LONG).show();
        }
    }
}
