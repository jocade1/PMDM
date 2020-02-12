package com.example.proyecto.Base_Datos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class DataBaseHelper {
    private Context context=null;
    private  DataBaseHelper dataBaseHelper=null;
    private SQLiteDatabase liteDatabase=null;
    public static final int DATABASE_VERSION=3;
    public static final String DATABASE_NAME= "Dbproyecto";

    public static final String TABLE_USUARIOS="Usuarios";
    public static final String USUARIOS_ID="user_id";
    public static final String USUARIOS_NOMBRE="user_name";
    public static final String USUARIOS_EMAIL="user_email";
    public static final String USUARIOS_PASSWORD="user_password";


    public static final String DATABASE_CREATE_USUARIO= "create table"+TABLE_USUARIOS +"("
            +USUARIOS_ID+"integer primary key,"
            +USUARIOS_NOMBRE+ "text not null,"
            +USUARIOS_EMAIL+"text not null,"
            +USUARIOS_PASSWORD+"text"+")";

    public DataBaseHelper(Context context){

    }



}
