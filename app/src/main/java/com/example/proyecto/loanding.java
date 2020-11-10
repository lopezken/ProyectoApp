package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import java.util.Random;

public class loanding extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loanding);
        TextView mensaje= findViewById(R.id.lb_mensaje);

        Random r = new Random();
        String msj [] = {"Consejo 1","Consejo 2","Consejo 3","Consejo 4","Consejo 5"};
        int n = r.nextInt(5);
        String generador = msj [n];
        mensaje.setText(generador);

        new Handler().postDelayed(new Runnable(){

            @Override
            public void run() {
                Intent i = new Intent(loanding.this,easy_page1.class);
                startActivity(i);
            }
        },4000);
    }


}