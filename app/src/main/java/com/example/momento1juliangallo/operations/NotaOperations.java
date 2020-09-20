package com.example.momento1juliangallo.operations;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;
import android.widget.Toast;

import com.example.momento1juliangallo.database.SQLHelper;
import com.example.momento1juliangallo.models.Estudiante;

import java.util.ArrayList;

public class NotaOperations {
    private String DBNAME = "notas";
    private int VERSION = 1;
    public final Context context;
    private SQLiteDatabase database;
    private SQLHelper helper;
    private Estudiante model;


    public NotaOperations(Context context)
    {
        this.context = context;
        helper = new SQLHelper(context, DBNAME, null, VERSION);
    }

    public  void openRead()
    {
        database = helper.getReadableDatabase();
    }
    public void openWrite() {
        database = helper.getWritableDatabase();
    }
    public void close ()
    {
        database.close();
    }
    public int insert(Estudiante model)
    {
        openWrite();

        ContentValues content = new ContentValues();
        content.put("Nombre", model.getNombre());
        content.put("Nota", model.getNota());


        long id = database.insert("nota", null, content);
        close();
        return (int)id;
    }



    public ArrayList<String> list()
    {
        openRead();
        ArrayList<String> lista = new ArrayList<String>();

        Cursor cursor = database.query("nota", null, null, null, null, null, null);
        if (cursor.getCount() > 0)
        {
            cursor.moveToFirst();
            String consolidadoString;
            do {
                int id = cursor.getInt(cursor.getColumnIndex("id"));
                String nombre = cursor.getString(cursor.getColumnIndex("nombre"));
                Double nota = cursor.getDouble(cursor.getColumnIndex("nota"));
                consolidadoString = String.valueOf(id) + "-" + nombre + " - " + String.valueOf(nota);
                lista.add(consolidadoString);
            }
            while (cursor.moveToNext());
        }
        close();

        return lista;

    }

}
