package com.example.basadatosorganizadas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.ContactsContract;

public class MainActivity extends AppCompatActivity {
    public DataBaseHelper cliBDh = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cliBDh = new DataBaseHelper(this);
        cliBDh.open();

        if(cliBDh!= null){
            for(int cont = 1;cont <=3;cont++){
                int codigo = cont;
                String nombre = "cli!"+ cont;
                String telefono = cont + "XXXXXX";
                cliBDh.insertItem(codigo,nombre,telefono);
            }
        }

        cliBDh.close();
    }
}
