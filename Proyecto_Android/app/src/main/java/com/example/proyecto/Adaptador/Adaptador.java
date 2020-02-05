package com.example.proyecto.Adaptador;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyecto.Clases.ClasePrincipal;
import com.example.proyecto.R;

public class Adaptador extends ArrayAdapter {
    Activity actividad;

    public Adaptador(Activity actividad) {
        super(actividad, R.layout.activityadaptador, ClasePrincipal.canciones);
        this.actividad = actividad;
    }

    public View getView(int posicion, View view, ViewGroup viewGroup) {
        LayoutInflater inflater = actividad.getLayoutInflater();
        View item = inflater.inflate(R.layout.activityadaptador,null);


        ImageView foto = (ImageView) item.findViewById(R.id.ImagenView_foto);
        foto.setImageResource(ClasePrincipal.canciones[posicion].getFoto());


        TextView titulo = (TextView) item.findViewById(R.id.TextView_titulo);
        titulo.setText(ClasePrincipal.canciones[posicion].getTitulo());


        TextView autor = (TextView) item.findViewById(R.id.TextView_autor);
        autor.setText(ClasePrincipal.canciones[posicion].getAutor());


        TextView anho = (TextView) item.findViewById(R.id.TextView_anho);
        anho.setText(ClasePrincipal.canciones[posicion].getFecha());


        TextView duracion = (TextView) item.findViewById(R.id.TextView_duracion);
        duracion.setText(String.valueOf(ClasePrincipal.canciones[posicion].getDuracion()));


        TextView genero = (TextView) item.findViewById(R.id.TextView_genero);
        genero.setText(ClasePrincipal.canciones[posicion].getGenero());

        return item;



    }
}
