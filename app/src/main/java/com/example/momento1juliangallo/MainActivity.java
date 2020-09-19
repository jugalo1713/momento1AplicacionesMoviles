package com.example.momento1juliangallo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button registrar;
    private Button listar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        registrar = findViewById(R.id.btn_registrar);
        listar = findViewById(R.id.btn_listarNotas);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               registrar();
            }
        });

        listar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listar();
            }
        });
    }

    public void registrar ()
    {
        Intent intent = new Intent(this, RegistrarNotas.class);
        startActivity(intent);
    }
    public void listar ()
    {
        Intent intent = new Intent(this, ListarNotas.class);
        startActivity(intent);
    }

}