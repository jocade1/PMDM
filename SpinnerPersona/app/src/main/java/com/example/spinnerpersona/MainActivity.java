package com.example.spinnerpersona;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Persona[] personas = new Persona[]{
        new Persona("Jose", "Cámara"), new Persona("Javier","Gonzalez"),new Persona("Alba","Garcia")};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdaptadorPersona adaptador = new AdaptadorPersona((this));
        ListView lstOptions = (ListView)findViewById(R.id.Opciones);
        lstOptions.setAdapter(adaptador);

        lstOptions.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String mensaje ="Nombre: "+personas[position].getNombre()+" apellido: "+personas[position].getApellido();
                Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_LONG).show();
            }
       /*     @Override
            public void onNothingSelected(AdapterView<?>adapterView) {
            }*/

        });




    }


    public class AdaptadorPersona extends ArrayAdapter {
        Activity context;

        AdaptadorPersona(Activity context){
            super(context, R.layout.listitem_persona,personas);
            this.context = context;

        }

        public View getView(int i, View convertView, ViewGroup parent){
            LayoutInflater inflater = context.getLayoutInflater();
            View item = inflater.inflate(R.layout.listitem_persona,null);

            TextView Nombre = (TextView) item.findViewById(R.id.Nombre);
            Nombre.setText(personas[i].getNombre());

            TextView Apellido = (TextView)item.findViewById(R.id.Apellido);
            Apellido.setText(personas[i].getApellido());
            return item;
        }
    }

}
