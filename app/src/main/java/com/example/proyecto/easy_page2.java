package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class easy_page2 extends AppCompatActivity {

    private RadioButton Rb1,Rb2, Rb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_page2);

        Rb1 = findViewById(R.id.RB_1);
        Rb2 = findViewById(R.id.RB_2);
        Rb3= findViewById(R.id.RB_3);
    }

    public void onclick (View view)
    {
        if (view.getId()== R.id.BTN_aceptar ){

            validar();
        }

    }
    private void  validar(){
        String cad="Seleccionado: \n";

        if (Rb1.isChecked()==true){
            Rb1.setBackgroundColor(Color.rgb(255,0,0));
        }


    }



    public void Siguiente(View view){
        Intent i = new Intent(this, easy_page3.class);
        startActivity(i);
    }

}