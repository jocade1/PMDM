package com.example.spinnerconlistas;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.app.Person;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Persona[] personas = new Persona[]{new Persona("Jose","Camara",22),
            new Persona("Aaron","Palmer",23), new Persona("Jaume","Pons",19)};

    Spinner miSpinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final String[] nombres = new String[personas.length];
        for (int i=0; i< personas.length;i++){
            nombres[i] = personas[i].getNombre();
        }

        String mensaje;
        miSpinner = (Spinner) findViewById(R.id.Spinner);
        ArrayAdapter<String> miAdaptador = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, nombres);
        miAdaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        miSpinner.setAdapter(miAdaptador);

        miSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }

    public class AdaptadorPersona extends ArrayAdapter<Persona> {
        public Activity miActividad;

        public AdaptadorPersona(Activity laActividad){
            super(laActividad, R.layout.datos,personas);
            this.miActividad = laActividad;

        }
        public View getDropDownView(int position, View convertView, ViewGroup Parent) {
            LayoutInflater inflater = miActividad.getLayoutInflater();
            View item = inflater.inflate(R.layout.datos, null);

            TextView nombre = (TextView) item.findViewById(R.id.Nombre);
            TextView apellido = (TextView) item.findViewById(R.id.Apellido);
            TextView edad = (TextView) item.findViewById(R.id.Edad);

            nombre.setText(personas[position].getNombre());
            apellido.setText(personas[position].getApellido());
            edad.setText(personas[position].getEdad());

            return item;

        }



    }
}
