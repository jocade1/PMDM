package com.example.objetoentreactividades;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    protected EditText miNombre;
    protected EditText miApellido;
    protected EditText miEdad;
    protected Persona p;
    protected Button miBoton;
    protected ImageView miFoto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        miNombre =(EditText)findViewById(R.id.miNombre);
        miApellido =(EditText)findViewById(R.id.miApellido);
        miEdad =(EditText)findViewById(R.id.miEdad);
        miFoto = (ImageView)findViewById(R.id.imagenPersona);
        miBoton = (Button)findViewById(R.id.button);


        miFoto.setImageResource(R.drawable.imagenpersona);
        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombre = miNombre.getText().toString();
                String apellido = miApellido.getText().toString();
                String edad = miEdad.getText().toString();
                    if(TextUtils.isEmpty(edad)) edad="0";
                    p = new Persona(nombre,apellido,Integer.parseInt(edad),R.drawable.imagenpersona);
                Toast.makeText(v.getContext(),p.toString(), Toast.LENGTH_LONG).show();
                   // showToast(p.toString());
                    Intent intent = new Intent(MainActivity.this, Ventana2.class);
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("ClavePer", p);
                    intent.putExtras(bundle);
                    startActivity(intent);
            }
        });




    }
}
