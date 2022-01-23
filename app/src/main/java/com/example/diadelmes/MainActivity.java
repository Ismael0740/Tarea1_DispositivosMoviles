package com.example.diadelmes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    EditText textField;
   static String diaIntroducido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textField=(EditText) findViewById(R.id.editTextNumber);
        Button boton = findViewById(R.id.button2);
    }

    //Metodo para el boton que accede a la actividad 2
    public void Boton(View view){
        diaIntroducido= textField.getText().toString();

        if(diaIntroducido.equals("")){
            Context context = getApplicationContext();
            CharSequence text = "Introduce un valor";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, text, duration).show();
        } else{
            Intent boton = new Intent(this, Resultado.class);
            startActivity(boton);
        }
    }

}