package com.examempmp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class AdaptadorPizza extends ArrayAdapter<Pizza> {

    class Contenedor{
        TextView tvNombre;
        TextView tvPrecio_Base;
        TextView tvPrecioExtra;
        TextView tvUnidades;
        ImageView ivImagen;
        TextView tvEnvio;
        TextView tvPrecioFinal;


    }

    private List<Pizza> pizzas;

    public AdaptadorPizza(@NonNull Context context, int resource, @NonNull ArrayList<Pizza> pizzas) {
        super(context, resource, pizzas;
        this.pizzas = pizzas;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View v = convertView;
        Contenedor contenedor;
        if(v == null){
            v = LayoutInflater.from(parent.getContext()).inflate(R.layout.factura_final, parent, false);
            contenedor = new Contenedor();
            contenedor.tvNombre = v.findViewById(R.id.item_nombre);
            contenedor.tvUnidades = v.findViewById(R.id.item_unidades);
            contenedor.tvPrecioFinal = v.findViewById(R.id.item_precioFinal);
            contenedor.ivImagen = v.findViewById(R.id.item_image);
            contenedor.tvEnvio= v.findViewById(R.id.item_envio);
            contenedor.tvPrecio_Base= v.findViewById(R.id.item_precioBase);
            contenedor.tvPrecioExtra= v.findViewById(R.id.item_precioExtra);
            v.setTag(contenedor);
        }else
            contenedor = (Contenedor) v.getTag();
        Pizza pizza = pizzas.get(position);
        contenedor.tvNombre.setText(pizza.getNombre());
        contenedor.tvPrecio_Base.setText(pizza.getPrecio());

        return v;
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getView(position, convertView, parent);
    }

    @Override
    public int getCount() {
        return pizzas.size();
    }
}





