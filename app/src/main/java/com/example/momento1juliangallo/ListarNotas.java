package com.example.momento1juliangallo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.momento1juliangallo.operations.NotaOperations;

import java.util.ArrayList;

public class ListarNotas extends AppCompatActivity {

    ArrayList<String> lista = new ArrayList<>();
    ArrayAdapter items;
    private ListView lv_notas;
    private NotaOperations operations = new NotaOperations(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_notas);

        operations.list();
        lista = operations.list();
        lv_notas = findViewById(R.id.lv_Notas);
        items = new ArrayAdapter(this, android.R.layout.simple_list_item_1, lista);
        lv_notas.setAdapter(items);
    }
}