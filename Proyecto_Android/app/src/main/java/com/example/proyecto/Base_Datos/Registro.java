package com.example.proyecto.Base_Datos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.proyecto.Clases.MainActivity;
import com.example.proyecto.Clases.Usuario;
import com.example.proyecto.R;

import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Registro extends AppCompatActivity /*implements View.OnClickListener*/ {


    private final AppCompatActivity activity = Registro.this;
     public static TextView textView_nombre = null;
     public static TextView textView_edad= null;
     public static TextView textView_usuario= null;
     public static TextView textView_password= null;
     public static DataBaseHelper dataBaseHelper=null;
     public static Usuario usuario =null;
     public static Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        textView_nombre=(TextView)findViewById(R.id.EditText_Nombre);

        textView_edad=(TextView)findViewById(R.id.EditText_Edad);

        textView_usuario=(TextView)findViewById(R.id.EditText_Usuario);

        textView_password=(TextView)findViewById(R.id.EditText_Password);

        registrar = (Button)findViewById(R.id.btn_Registrar);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }



    protected static void saveData(){



        String nombre = textView_nombre.getText().toString();
        String edad = textView_edad.getText().toString();
        String user = textView_usuario.getText().toString();
        String password = textView_password.getText().toString();


        try{
            dataBaseHelper.open();
            dataBaseHelper.addUser(usuario);
        }catch (Exception e){
            e.printStackTrace();
        }
        dataBaseHelper.close();
    }

/*

    public static class Usuario extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_usuario);

            dataBaseHelper = new DataBaseHelper(this);

        }



*/

   // }
}
