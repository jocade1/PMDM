package com.example.ejemplo;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class EjemploBaseDatos extends Activity {
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ClientesSQLiteHelper cliBDh = new ClientesSQLiteHelper(this,"DBClientes", null, 1);

        SQLiteDatabase bd = cliBDh.getWritableDatabase();

        if(bd!=null) {
            for(int cont = 1;cont <= 3; cont++){
                int codigo = cont;
                String nombre = "Cli"+ cont;
                String telefono = cont +"xxxxxxxx";

                bd.execSQL("INSERT INTO Clientes (codigo, nombre, telefono)" + "VALUES ("+ codigo + ", '"+ nombre + "', '" + telefono +"')");
            }
        }
        bd.close();
    }

}
