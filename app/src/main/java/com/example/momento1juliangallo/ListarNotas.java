package com.example.momento1juliangallo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ListarNotas extends AppCompatActivity {

    String notas [] = {"julian", "tatiana"};
    ArrayAdapter items;
    private ListView lv_notas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_notas);

        lv_notas = findViewById(R.id.lv_Notas);
        items = new ArrayAdapter(this, android.R.layout.simple_list_item_1, notas);
        lv_notas.setAdapter(items);


    }
}