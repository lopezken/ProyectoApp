package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
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

        if (Rb1.isChecked()==true)
        {
            Rb1.setBackgroundColor(Color.rgb(255,0,0));
            Rb2.setBackgroundColor(Color.rgb(0,128,0));

            Button boton = (Button) findViewById(R.id.BTN_aceptar);
            boton.setEnabled(false);

            Button boton2 = (Button) findViewById(R.id.button3);
            boton2.setEnabled(true);
        }
        if (Rb2.isChecked()==true)
        {
            Rb2.setBackgroundColor(Color.rgb(0,128,0));

            Button boton = (Button) findViewById(R.id.BTN_aceptar);
            boton.setEnabled(false);

            Button boton2 = (Button) findViewById(R.id.button3);
            boton2.setEnabled(true);
        }
        if (Rb3.isChecked()==true)
        {
            Rb3.setBackgroundColor(Color.rgb(255,0,0));
            Rb2.setBackgroundColor(Color.rgb(0,128,0));


            Button boton = (Button) findViewById(R.id.BTN_aceptar);
            boton.setEnabled(false);

            Button boton2 = (Button) findViewById(R.id.button3);
            boton2.setEnabled(true);
        }


    }



    public void Siguiente(View view){
        Intent i = new Intent(this, easy_page3.class);
        startActivity(i);
    }

}