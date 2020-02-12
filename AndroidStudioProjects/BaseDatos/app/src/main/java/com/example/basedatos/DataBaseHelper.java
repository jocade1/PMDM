package com.example.basedatos;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;

public class DataBaseHelper {

    private Context mCtx = null;
    private SQLiteDatabase mDb = null;
    private DataBaseHelperInternal mDBHelper = null;
    private static final String DATABASE_NAME = "DBClientes";
    private static final int DATABASE_VERSION = 3;
    private static final String DATABASE_TABLE_CLIENTES = "Clientes";
    private static final String CODIGO = "codigo";
    private static final String NOMBRE = "nombre";
    private static final String TELEFONO = "telefono";
    private static final String DATABASE_CREATE_CLIENTES ="create table "+ DATABASE_TABLE_CLIENTES+ " ("+ CODIGO+ " integer primary key ," +NOMBRE + "text not null,"+TELEFONO+ "text not null" + ")";

    public DataBaseHelper(Context ctx){
        mCtx = ctx;
    }

    private static class DataBaseHelperInternal extends SQLiteOpenHelper{
        public DataBaseHelperInternal(Context context){
            super(context,DATABASE_NAME ,null , DATABASE_VERSION);

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

        private void createTables(SQLiteDatabase db){
            db.execSQL(DATABASE_CREATE_CLIENTES);
        }

        private void deleteTables(SQLiteDatabase db){
            db.execSQL("DROP TABLE  IF EXISTS "+ DATABASE_TABLE_CLIENTES);
        }
    }

    public DataBaseHelper open() {
        mDBHelper = new DataBaseHelperInternal(mCtx);
        mDb = mDBHelper.getWritableDatabase();
        return this;

    }









}
