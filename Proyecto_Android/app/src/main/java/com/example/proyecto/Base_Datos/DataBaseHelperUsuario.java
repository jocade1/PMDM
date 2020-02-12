package com.example.proyecto.Base_Datos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;
import android.provider.ContactsContract;

import com.example.proyecto.Clases.Usuario;

public class DataBaseHelperUsuario  extends SQLiteOpenHelper {
    public DataBaseHelperUsuario(Context context) {
        super(context,DataBaseHelper.DATABASE_NAME,null,DataBaseHelper.DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DataBaseHelper.TABLE_USUARIOS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void addUser(Usuario user){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DataBaseHelper.USUARIOS_NOMBRE,user.getNombre());
        values.put(DataBaseHelper.USUARIOS_EMAIL,user.getEmail());
        values.put(DataBaseHelper.USUARIOS_PASSWORD,user.getPassword());
        values.put(DataBaseHelper.USUARIOS_ID,user.getPassword());

        db.insert(DataBaseHelper.DATABASE_NAME,null,values);
        db.close();
    }

    public boolean checkEmail(String email) {
        String[] columns={
                DataBaseHelper.USUARIOS_ID
        };
        SQLiteDatabase db = this.getWritableDatabase();
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
        SQLiteDatabase db = this.getWritableDatabase();
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

