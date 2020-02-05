package com.example.proyecto.Clases;

import java.io.Serializable;

public class Cantante implements Serializable {
    private String nombre;
    private String apellido;
    private int edad;
    private String nacionalidad;
    private int foto;



    public Cantante(){

    }


    public Cantante(String nombre, String apellido, int edad, String nacionalidad, int foto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.foto = foto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getFoto() {
        return foto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
