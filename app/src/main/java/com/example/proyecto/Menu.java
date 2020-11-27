package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.NumberPicker;
import android.widget.TextView;

public class Menu extends AppCompatActivity {

    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        tv1 = (TextView)findViewById(R.id.tv1);
        String dato = getIntent().getStringExtra("dato");
        tv1.setText("Hola "+ dato);
    }
    public void siguiente(View view){
        Intent i = new Intent(this,loanding.class);
        startActivity(i);
    }

}