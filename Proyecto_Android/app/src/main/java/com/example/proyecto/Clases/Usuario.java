package com.example.proyecto.Clases;

public class Usuario {
    private String nombre;
    public static String id;
    private String email;
    private String password;

    public Usuario(String nombre, String id,String email,String password){
        this.nombre=nombre;
        this.id=id;
        this.email=email;
        this.password=password;
    }

    public String getNombre(){
        return nombre;

    }

    public String gedId(){
        return id;

    }

    public String getEmail(){
        return email;

    }

    public String getPassword(){
        return password;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String password) {
        this.password = password;
    }

}
