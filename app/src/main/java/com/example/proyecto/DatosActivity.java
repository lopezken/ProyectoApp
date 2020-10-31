package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.NumberPicker;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {
    private TextView txtNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        txtNombre = findViewById(R.id.txtNombreUsuario);
        NumberPicker npedad= findViewById(R.id.npEdad);
        npedad.setMinValue(0);
        npedad.setMaxValue(100);

    }
    public void siguiente(View view){
        Intent i = new Intent(this, Menu.class);
        startActivity(i);
    }
}