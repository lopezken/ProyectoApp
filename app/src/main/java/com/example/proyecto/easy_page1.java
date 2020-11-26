package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Locale;

public class easy_page1 extends AppCompatActivity {
    private RadioButton Rb1,Rb2, Rb3, Rb4;
    private TextView textView;
    private CountDownTimer countDownTimer;
    private Button Btn_aceptar, Btn_siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_page1);
        Rb1 = findViewById(R.id.Rb1);
        Rb2 = findViewById(R.id.Rb2);
        Rb3= findViewById(R.id.Rb3);
        Rb4= findViewById(R.id.Rb4);

        textView = findViewById(R.id.contador);
        Btn_aceptar = findViewById(R.id.aceptar);
        Btn_siguiente = (Button) findViewById(R.id.btn_siguiente);

            countDownTimer = new CountDownTimer(25000, 1000) {
            public void onTick(long millisUntilFinished) {
                textView.setText(String.format(Locale.getDefault(), "%d sec.", millisUntilFinished / 1000L));
            }

            public void onFinish() {
                AlertDialog.Builder builder = new AlertDialog.Builder(easy_page1.this);
                Btn_aceptar.setEnabled(false);
                Btn_siguiente.setEnabled(true);
                builder.setTitle("Importante");
                builder.setMessage("¡Su tiempo limite ha acabado! :c");
                builder.setPositiveButton("OK",null);
                builder.create();
                builder.show();
            }
        }.start();

    }

    public void validar(View view){

        if (Rb1.isChecked()==true){
            Rb1.setBackgroundColor(Color.rgb(255,0,0));
            Rb3.setBackgroundColor(Color.rgb(0,128,0));
            Btn_aceptar.setEnabled(false);
            countDownTimer.cancel();
            Btn_siguiente.setEnabled(true);
        }
        else if (Rb2.isChecked()==true){
            Rb2.setBackgroundColor(Color.rgb(255,0,0));
            Rb3.setBackgroundColor(Color.rgb(0,128,0));
            Btn_aceptar.setEnabled(false);
            countDownTimer.cancel();
            Btn_siguiente.setEnabled(true);
        }
        else if (Rb3.isChecked()==true){
            Rb3.setBackgroundColor(Color.rgb(0,128,0));
            Btn_aceptar.setEnabled(false);
            countDownTimer.cancel();
            Btn_siguiente.setEnabled(true);
        }
        else if (Rb4.isChecked()==true){
            Rb4.setBackgroundColor(Color.rgb(255,0,0));
            Rb3.setBackgroundColor(Color.rgb(0,128,0));
            Btn_aceptar.setEnabled(false);
            countDownTimer.cancel();
            Btn_siguiente.setEnabled(true);
        }
    }

    public void siguiente(View view){
        Intent i = new Intent(this, easy_page2.class);
        startActivity(i);
    }
}