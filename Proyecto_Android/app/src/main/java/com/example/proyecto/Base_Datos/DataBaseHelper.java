package com.example.proyecto.Base_Datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.TextView;

import com.example.proyecto.Clases.Usuario;

public class DataBaseHelper {
    public  Context context=null;
    private DataBaseHelperUsuario dataBaseHelper=null;
    private SQLiteDatabase db=null;
    public static final int DATABASE_VERSION=3;
    public static final String DATABASE_NAME= "Dbproyecto";

    public static final String TABLE_USUARIOS="Usuarios";
    public static final String USUARIOS_ID="user_id";
    public static final String USUARIOS_NOMBRE="user_name";
    public static final String USUARIOS_EMAIL="user_email";
    public static final String USUARIOS_PASSWORD="user_password";



    public static final String TABLE_CANCIONES_FAVORITAS="Canciones";
    public static final String CANCIONES_ID="cancion_id";
    public static final String CANCIONES_NOMBRE="cancion_name";
    public static final String CANCIONES_AUTOR = "cancion_autor";
    public static final String CANCIONES_DURACION="cancion_duracion";


    private TextView textView_nombre;
    private TextView textView_edad;
    private TextView textView_usuario;
    private TextView textView_contraseña;






    public static final String DATABASE_CREATE_USUARIO= " create table "+TABLE_USUARIOS +"("
            +USUARIOS_ID+" text primary key,"
            +USUARIOS_NOMBRE+ " text not null,"
            +USUARIOS_EMAIL+" text not null,"
            +USUARIOS_PASSWORD+" text"+")";



    public static final String DATABASE_CREATE_CANCIONES_FAVORITAS =" create table " + TABLE_CANCIONES_FAVORITAS +"("
            +CANCIONES_ID+" text primary key,"
            +CANCIONES_NOMBRE+" text not null,"
            +CANCIONES_AUTOR+" text not null,"
            +CANCIONES_DURACION+" text not null"
            +USUARIOS_ID+" text not null"
            +" FOREIGN KEY ( "+CANCIONES_ID+ " ) REFERENCES "+TABLE_USUARIOS+" ( "+CANCIONES_ID+" )";





    public DataBaseHelper(Context context){
        this.context = context;

    }

    public void addUser(Usuario user) {
        //db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DataBaseHelper.USUARIOS_NOMBRE,user.getNombre());
        values.put(DataBaseHelper.USUARIOS_EMAIL,user.getEmail());
        values.put(DataBaseHelper.USUARIOS_PASSWORD,user.getPassword());
        values.put(DataBaseHelper.USUARIOS_ID,user.getPassword());

        db.insert(DataBaseHelper.DATABASE_NAME,null,values);
        db.close();
    }


    private class DataBaseHelperUsuario  extends SQLiteOpenHelper { //Clase interna
        public DataBaseHelperUsuario(Context context) {
            super(context, DataBaseHelper.DATABASE_NAME, null, DataBaseHelper.DATABASE_VERSION);
        }

        @Override
        public void onCreate(SQLiteDatabase db) {
            createTables(db);
        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            deleteTables(db);
            createTables(db);

        }

        private void createTables(SQLiteDatabase db) {
            db.execSQL(DataBaseHelper.DATABASE_CREATE_USUARIO);

        }


        private void deleteTables(SQLiteDatabase db) {
            db.execSQL("DROP TABLE IF EXISTS " + DataBaseHelper.DATABASE_NAME);
        }


    }


    public DataBaseHelper open(){

        dataBaseHelper = new DataBaseHelperUsuario(context);
        db = dataBaseHelper.getWritableDatabase();
        return this;
    }





    public void close(){
        dataBaseHelper.close();
    }




        public boolean checkEmail(String email) {
            String[] columns={
                    DataBaseHelper.USUARIOS_ID
            };
            //db = this.getWritableDatabase();
            String selection = DataBaseHelper.USUARIOS_EMAIL + " = ?";
            String[] selectionArgs = {email};

            Cursor cursor = db.query(DataBaseHelper.TABLE_USUARIOS,columns,selection,selectionArgs,
                    null,null,null);
            int cursorCount = cursor.getCount();
            cursor.close();
            db.close();

            if(cursorCount>0){
                return true;
            }
            return false;
        }


        public boolean checkUser(String email, String password){
            String[] columns = {
                    DataBaseHelper.USUARIOS_ID
            };
            //db = this.getWritableDatabase();
            String selection = DataBaseHelper.USUARIOS_EMAIL + " = ?"+ " AND "+ DataBaseHelper.USUARIOS_PASSWORD+ " = ?";
            String[] selectionArgs = {email, password};

            Cursor cursor = db.query(DataBaseHelper.TABLE_USUARIOS,columns,selection,selectionArgs,
                    null,null,null);
            int cursorCount = cursor.getCount();
            cursor.close();
            db.close();

            if(cursorCount >0){
                return true;
            }
            return false;
        }
















    }






