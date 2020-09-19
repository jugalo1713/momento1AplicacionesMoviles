package com.example.momento1juliangallo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class RegistrarNotas extends AppCompatActivity {


    private EditText nombre;
    private EditText nota;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_notas);

        nombre = findViewById(R.id.et_Nombre);
        nota = findViewById(R.id.et_ValorNota);
    }



}