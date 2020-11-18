package com.example.proyecto;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        //Animaciones
        Animation animacion1= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animacion2= AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        TextView trtextview = findViewById(R.id.text_tr);
        TextView ivitextview = findViewById(R.id.txt_via);
        TextView atextview = findViewById(R.id.txt_a);
        TextView test_textview =findViewById(R.id.Test_textView);
        ImageView logoimage= findViewById(R.id.logo);

        trtextview.setAnimation(animacion2);
        ivitextview.setAnimation(animacion2);
        atextview.setAnimation(animacion2);
        test_textview.setAnimation(animacion2);
        logoimage.setAnimation(animacion1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Inicio.class);
                Pair[] pairs = new Pair[2];
                pairs[0]= new Pair<View, String>(logoimage,"logoImage");
                pairs[1]= new Pair<View, String>(test_textview, "textTrans");
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){
                    ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
                    startActivity(i,options.toBundle());
                }else{
                    startActivity(i);
                    finish();
                }

            }
        }, 2250);
    }



}