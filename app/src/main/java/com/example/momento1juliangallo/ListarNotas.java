package com.example.momento1juliangallo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        lv_notas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valor = lista.get(position);
                Toast.makeText(getApplicationContext(), "El item seleccionado es: "+ valor, Toast.LENGTH_LONG).show();
            }
        });
    }
}