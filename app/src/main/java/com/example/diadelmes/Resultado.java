package com.example.diadelmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class Resultado extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        final MediaPlayer mp1 = MediaPlayer.create(this, R.raw.correcto);
        final MediaPlayer mp2 = MediaPlayer.create(this, R.raw.error);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        String valor = MainActivity.diaIntroducido;

        Calendar cal = Calendar.getInstance();
        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);

        String dayOfMonthStr = String.valueOf(dayOfMonth);

        if(dayOfMonthStr.equals(valor)){
            ((TextView) findViewById(R.id.textView2)).setText("Correcto!!");
            ((TextView) findViewById(R.id.textView2)).setTextColor(Color.GREEN);
            ((TextView) findViewById(R.id.button)).setText("Volver a empezar");
            mp1.start();
        } else{
            ((TextView) findViewById(R.id.textView2)).setText("No es correcto..!!");
            ((TextView) findViewById(R.id.textView2)).setTextColor(Color.RED);
            ((TextView) findViewById(R.id.button)).setText("Reintentar");
            mp2.start();
        }
    }

    //Metodo para el boton que accede a la actividad 1
    public void boton(View view){
        Intent boton = new Intent(this, MainActivity.class);
        startActivity(boton);
    }

}