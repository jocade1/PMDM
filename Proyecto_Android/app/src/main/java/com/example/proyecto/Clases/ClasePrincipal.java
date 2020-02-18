package com.example.proyecto.Clases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.ListView;

import com.example.proyecto.R;
import com.example.proyecto.Adaptador.Adaptador;


public class ClasePrincipal extends AppCompatActivity {

    public static Cancion[] canciones = new Cancion[]{
            new Cancion("DanceMonkey ","Tones and I ","2019, ",210," Pop",R.drawable.dancemonkety),
            new Cancion("Used to Love ","Martin Garrix ","2019 ",240," Pop",R.drawable.usedtolove),
            new Cancion("Keep you Mine ","NOTH ","2019 ",180," Pop",R.drawable.keepyoumine),
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_claseprincipal);

        Adaptador adaptador = new Adaptador(this);
        ListView listView= (ListView) findViewById(R.id.ListViewCanciones);
        listView.setAdapter(adaptador);




    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu, menu);
        return true;
    }

}
