package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class DatosActivity extends AppCompatActivity {
    private TextView txtNombre;
    private EditText txtNombreUsuario;
    private NumberPicker npedad;
    private String valor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
        txtNombre = findViewById(R.id.txtNombreUsuario);
        npedad= findViewById(R.id.npEdad);
        txtNombreUsuario =(EditText)findViewById(R.id.txtNombreUsuario);
        npedad.setMinValue(0);
        npedad.setMaxValue(100);
        npedad.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
                 valor= String.valueOf(npedad.getValue());
            }
        });
    }

    public void setTextColor (int color){
        
    }
    public void siguiente(View view){
        Intent i = new Intent(this, Menu.class);
        i.putExtra("dato", txtNombreUsuario.getText().toString());
        i.putExtra("value", valor);

        startActivity(i);
    }
}