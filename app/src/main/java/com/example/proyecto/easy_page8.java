package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.Locale;

public class easy_page8 extends AppCompatActivity {

    private RadioButton Rb_1,Rb_2, Rb_3, Rb_4;
    private TextView textView;
    private CountDownTimer countDownTimer;
    private Button Btn_aceptar, Btn_siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_page8);

        Rb_1 = findViewById(R.id.Rb1);
        Rb_2 = findViewById(R.id.Rb2);
        Rb_3= findViewById(R.id.Rb3);
        Rb_4= findViewById(R.id.Rb4);

        textView = findViewById(R.id.contador);

        Btn_aceptar = findViewById(R.id.btn_Aceptar);
        Btn_siguiente = findViewById(R.id.btn_next);

        countDownTimer = new CountDownTimer(25000, 1000) {
            public void onTick(long millisUntilFinished) {
                textView.setText(String.format(Locale.getDefault(), "%d sec.", millisUntilFinished / 1000L));
            }

            public void onFinish() {
                AlertDialog.Builder builder = new AlertDialog.Builder(easy_page8.this);
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
    public void v(View view) {

        if ( Rb_1.isChecked() == true ) {
            Rb_1.setBackgroundColor(Color.rgb(255, 0, 0));
            Rb_3.setBackgroundColor(Color.rgb(0, 128, 0));
            Btn_aceptar.setEnabled(false);
            countDownTimer.cancel();
            Btn_siguiente.setEnabled(true);

        } else if ( Rb_2.isChecked() == true ) {
            Rb_2.setBackgroundColor(Color.rgb(255, 0, 0));
            Rb_3.setBackgroundColor(Color.rgb(0, 128, 0));
            Btn_aceptar.setEnabled(false);
            countDownTimer.cancel();
            Btn_siguiente.setEnabled(true);

        } else if ( Rb_3.isChecked() == true ) {
            Rb_3.setBackgroundColor(Color.rgb(0, 128, 0));
            Btn_aceptar.setEnabled(false);
            countDownTimer.cancel();
            Btn_siguiente.setEnabled(true);

        } else if ( Rb_4.isChecked() == true ) {
            Rb_4.setBackgroundColor(Color.rgb(255, 0, 0));
            Rb_3.setBackgroundColor(Color.rgb(0, 128, 0));
            Btn_aceptar.setEnabled(false);
            countDownTimer.cancel();
            Btn_siguiente.setEnabled(true);
        }
    }

    public void s(View view) {
        Intent i = new Intent(this, easy_page8.class);
        startActivity(i);
    }
}