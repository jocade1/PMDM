package com.example.listaobjetos;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.Collections;

public class AdaptadorPersona extends ArrayAdapter<Persona> {
    Activity context;

    public AdaptadorPersona(Activity context){
        super(context,R.layout.desplegado,MainActivity.personas);
        this.context=context;
    }

    public View getView(int i, View view, ViewGroup viewGroup){
        LayoutInflater inflater= context.getLayoutInflater();
        View item=inflater.inflate(R.layout.desplegado,null);

        TextView textnombre=(TextView)item.findViewById(R.id.nombre);
        textnombre.setText(MainActivity.personas[i].getNombre());

        TextView textApellido=(TextView)item.findViewById(R.id.apellido);
        textApellido.setText(MainActivity.personas[i].getApellido());

        return item;
    }








}
