package com.example.listasimple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    final static String semana[] = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String mensaje;
        listView = findViewById(R.id.listView1);
        ArrayAdapter<String> miAdaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,semana);
        listView.setAdapter(miAdaptador);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView arg0, View arg1, int position, long id) {
                String mensaje="";
                mensaje="Item clicked => " + semana[position];
                Toast.makeText(getApplicationContext(),mensaje,Toast.LENGTH_SHORT).show();

            }
        });
        }

 }

