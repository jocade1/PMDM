package com.example.proyecto.Clases;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.proyecto.Base_Datos.DataBaseHelper;
import com.example.proyecto.R;
import com.example.proyecto.Base_Datos.Registro;

public class MainActivity extends AppCompatActivity {

     public TextView tv_registro;
     public Button iniciar;

     public DataBaseHelper dataBaseHelperUsuario= null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        dataBaseHelperUsuario = new DataBaseHelper(this);
        dataBaseHelperUsuario.open();









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


        if(dataBaseHelperUsuario!=null){
            String nombre = "Jose";
            String edad = "24";
            String user ="josealbertopelu" ;
            String password = "1234";

        }
        dataBaseHelperUsuario.close();



    }
}
