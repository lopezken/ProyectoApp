package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class easy_page4 extends AppCompatActivity {

    private RadioButton Rb1, Rb2, Rb3, Rb4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_page4);

        Rb1 = findViewById(R.id.Rb1);
        Rb2 = findViewById(R.id.Rb2);
        Rb3 = findViewById(R.id.Rb3);
        Rb4 = findViewById(R.id.Rb4);


    }


    public void validar2(View view) {

        if (Rb1.isChecked() == true) {
            Rb1.setBackgroundColor(Color.rgb(255, 0, 0));
            Rb2.setBackgroundColor(Color.rgb(0, 128, 0));

            Button boton = (Button) findViewById(R.id.aceptar2);
            boton.setEnabled(false);

            Button boton2 = (Button) findViewById(R.id.button2);
            boton2.setEnabled(true);

        } else if (Rb2.isChecked() == true) {
            Rb2.setBackgroundColor(Color.rgb(0, 128, 0));

            Button boton = (Button) findViewById(R.id.aceptar2);
            boton.setEnabled(false);

            Button boton2 = (Button) findViewById(R.id.button2);
            boton2.setEnabled(true);

        } else if (Rb3.isChecked() == true) {
            Rb3.setBackgroundColor(Color.rgb(255, 0, 0));
            Rb2.setBackgroundColor(Color.rgb(0, 128, 0));

            Button boton = (Button) findViewById(R.id.aceptar2);
            boton.setEnabled(false);

            Button boton2 = (Button) findViewById(R.id.button2);
            boton2.setEnabled(true);

        } else if (Rb4.isChecked() == true) {
            Rb4.setBackgroundColor(Color.rgb(255, 0, 0));
            Rb2.setBackgroundColor(Color.rgb(0, 128, 0));

            Button boton = (Button) findViewById(R.id.aceptar2);
            boton.setEnabled(false);

            Button boton2 = (Button) findViewById(R.id.button2);
            boton2.setEnabled(true);

        }
    }
}