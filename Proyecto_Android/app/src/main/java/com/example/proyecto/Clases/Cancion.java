package com.example.proyecto.Clases;

import java.io.Serializable;

public class Cancion implements Serializable{
    private String titulo;
    private String fecha;
    private int duracion;
    private String autor;
    private int foto;
    private String genero;


    public Cancion(){

    }

    public Cancion(String titulo, String autor, String fecha, int duracion,String genero, int foto)  {
        this.titulo = titulo;
        this.autor = autor;
        this.fecha = fecha;
        this.duracion = duracion;
        this.genero = genero;
        this.foto = foto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getFecha() {
        return fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {return genero;}

    public int getFoto() {
        return foto;
    }

    public void setTitutlo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {this.genero = genero;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}




