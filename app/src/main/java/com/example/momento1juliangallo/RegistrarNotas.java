package com.example.momento1juliangallo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.momento1juliangallo.models.Estudiante;
import com.example.momento1juliangallo.operations.NotaOperations;

public class RegistrarNotas extends AppCompatActivity {


    private EditText nombre;
    private EditText nota;
    private Button btnRegistrar;

    private Estudiante model;
    private NotaOperations operations;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_notas);

        nombre = findViewById(R.id.et_Nombre);
        nota = findViewById(R.id.et_ValorNota);
        btnRegistrar = findViewById(R.id.btn_guardarRegistro);

        operations = new NotaOperations(this);
    }

    public void RegistrarNota(View view)
    {
        String nombre_string = nombre.getText().toString();
        String nota_string = nota.getText().toString();

        double nota_double = Double.parseDouble(nota_string);

        model = new Estudiante(nombre_string, nota_double);

            int respuesta = operations.insert(model);


        if (respuesta>0)
        {
            Toast.makeText(this, "Nota registrada exitosamente", Toast.LENGTH_LONG).show();

            nombre.setText("");
            nota.setText("");
        }
        else if (respuesta == 0)
        {
            Toast.makeText(this, "No se registro esxitosamente", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(this, "Ha ocurrido un error", Toast.LENGTH_LONG).show();
        }
       //Toast.makeText(this, "El nombre es: "+ model.getNombre() + " La nota es: "+ model.getNota(), Toast.LENGTH_LONG).show();
       //Toast.makeText(this, "El nombre es: "+nombre_string + " La nota es: "+ nota_double, Toast.LENGTH_LONG).show();

    }






}