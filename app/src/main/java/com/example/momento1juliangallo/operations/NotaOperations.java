package com.example.momento1juliangallo.operations;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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


    public NotaOperations(Context context) {
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

        close();
        return new ArrayList<String>();

    }

}
