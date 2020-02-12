package com.example.ejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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
                bd.execSQL("INSERT INTO Clientes (nombre, telefono) VALUES ('cli1','11111')");
                bd.execSQL("UPDATE Clientes SET telefono = '00000' WHERE nombre = 'cli1' ");
                bd.execSQL("DELETE FROM Clientes WHERE nombre='cli1'");





            }
            ContentValues nuevoRegistro = new ContentValues();
            nuevoRegistro.put("nombre","ClienteNuevo");
            nuevoRegistro.put("telefono","647117171");
            bd.insert("Clientes", null, nuevoRegistro);

        }
        bd.close();
    }
}
