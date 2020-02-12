package com.example.objetoentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Ventana2 extends AppCompatActivity {
    protected TextView miNombre;
    protected TextView miApellido;
    protected TextView miEdad;
    protected Persona p;
    protected ImageView miFoto;
    protected TextView datosPersona;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);

        miNombre = (TextView)findViewById(R.id.campoNom);
        miApellido = (TextView)findViewById(R.id.campoApe);
        miEdad = (TextView)findViewById(R.id.campoEd);
        miFoto = (ImageView)findViewById(R.id.campoFoto);
        datosPersona = (TextView)findViewById(R.id.todaPersona);

       p = (Persona)getIntent().getSerializableExtra("ClavePer");
        datosPersona.setText(p.toString());
        Toast.makeText(getApplicationContext(),p.toString(), Toast.LENGTH_LONG).show();



      miNombre.setText("Nombre: " + p.getNombre());
        miApellido.setText("Apellido: " + p.getApellido());
        miNombre.setText("Edad: " + p.getEdad());
        miFoto.setImageResource(p.getFoto());


    }
}
