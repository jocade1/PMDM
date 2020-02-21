package com.example.listaobjetos;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorSpace;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static Persona[]personas={
            new Persona("Antonio","Rocio"),
            new Persona("Blanca","Venez"),
            new Persona("Eduardo","Orozco")
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorPersona  adaptadorPersona=new AdaptadorPersona(MainActivity.this);
        ListView listView=(ListView)findViewById(R.id.list);
        listView.setAdapter(adaptadorPersona);

     listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
         @Override
         public void onItemClick(AdapterView args0, View args1, int position, long id) {

             String mensaje="Nombre: "+personas[position].getNombre()+" Apellido: "+personas[position].getApellido();

             Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();
         }


         public void onNothingSelected(AdapterView<?>adapterView){
         }
     });
    }
}
