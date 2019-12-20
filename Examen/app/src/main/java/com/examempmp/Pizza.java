package com.examempmp;

import java.io.Serializable;

public class Pizza implements Serializable {

    private String nombre;
    private String descripcion;
    private String precio;
    private int imagen;



public Pizza(String nombre,String descripcion, String precio, int imagen){
    this.nombre = nombre;
    this.descripcion = descripcion;
    this.precio = precio;
    this.imagen = imagen;
}


public String getNombre(){return nombre;}

public void setNombre(String nombre){
    this.nombre = nombre;

}

public String getDescripcion(){return descripcion;}

public void setDescripcion(String descripcion){
    this.descripcion = descripcion;
}

public String getPrecio(){return precio;}

public void setImagen(int imagen){this.imagen = imagen;}

}
