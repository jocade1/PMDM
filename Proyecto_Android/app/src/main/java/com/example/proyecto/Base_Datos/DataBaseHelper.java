package com.example.proyecto.Base_Datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DataBaseHelper {
    private Context context=null;
    private  DataBaseHelperUsuario dataBaseHelper=null;
    private SQLiteDatabase liteDatabase=null;
    public static final int DATABASE_VERSION=3;
    public static final String DATABASE_NAME= "Dbproyecto";

    public static final String TABLE_USUARIOS="Usuarios";
    public static final String USUARIOS_ID="user_id";
    public static final String USUARIOS_NOMBRE="user_name";
    public static final String USUARIOS_EMAIL="user_email";
    public static final String USUARIOS_PASSWORD="user_password";



    public static final String TABLE_CANCIONES="Canciones";
    public static final String CANCIONES_ID="cancion_id";
    public static final String CANCIONES_NOMBRE="cancion_name";
    public static final String CANCIONES_AUTOR = "cancion_autor";
    public static final String CANCIONES_DURACION="cancion_duracion";


    public static final String DATABASE_CREATE_CANCIONES ="create table" + TABLE_CANCIONES +"("
            +CANCIONES_ID+"text primary key,"
            +CANCIONES_NOMBRE+"text not null,"
            +CANCIONES_AUTOR+"text not null,"
            +CANCIONES_DURACION+"text not null"
            +"FOREIGN KEY ("+CANCIONES_ID+ ") REFERENCES"+TABLE_USUARIOS+" ("+CANCIONES_ID+")";



    public static final String DATABASE_CREATE_USUARIO= "create table"+TABLE_USUARIOS +"("
            +USUARIOS_ID+"text primary key,"
            +USUARIOS_NOMBRE+ "text not null,"
            +USUARIOS_EMAIL+"text not null,"
            +USUARIOS_PASSWORD+"text"+")";


    public DataBaseHelper(Context context){
        this.context = context;

    }

    public DataBaseHelper open(){

        dataBaseHelper = new DataBaseHelperUsuario(context);
        liteDatabase = dataBaseHelper.getWritableDatabase();
        return this;
    }

    public void close(){
        dataBaseHelper.close();
    }






}
