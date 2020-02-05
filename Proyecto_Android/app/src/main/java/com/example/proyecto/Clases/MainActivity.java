package com.example.proyecto.Clases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.example.proyecto.Adaptador.Adaptador;
import com.example.proyecto.R;
import com.example.proyecto.Base_Datos.Registro;

public class MainActivity extends AppCompatActivity {

     public TextView tv_registro;
     public Button iniciar;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
     /*   ListView listView= (ListView) findViewById(R.id.ListViewCanciones);
        Adaptador adaptador = new Adaptador(this);
        listView.setAdapter(adaptador);*/

        tv_registro = (TextView) findViewById(R.id.btn_registrar);

        tv_registro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Registro.class); //se llama desde le activity main al activity register
                MainActivity.this.startActivity(intent);
            }
        });

        iniciar = (Button) findViewById(R.id.btn_Iniciar);
        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,ClasePrincipal.class);
                startActivity(intent);

            }
        });



    }
}
