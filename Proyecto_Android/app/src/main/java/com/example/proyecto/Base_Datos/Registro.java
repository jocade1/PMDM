package com.example.proyecto.Base_Datos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.proyecto.Clases.MainActivity;
import com.example.proyecto.Clases.Usuario;
import com.example.proyecto.R;

import java.sql.DatabaseMetaData;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class Registro extends AppCompatActivity /*implements View.OnClickListener*/ {


    private final AppCompatActivity activity = Registro.this;
     public static EditText editText_nombre = null;
     public static EditText editText_usuario= null;
     public static EditText editText_password= null;
    public static EditText editText_email= null;
     public static DataBaseHelper dataBaseHelper=null;
    public static DataBaseHelper dataBaseHelperUsuario= null;
     public static Usuario usuario =null;
     public static Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        editText_nombre=(EditText)findViewById(R.id.EditText_Nombre);



        editText_usuario=(EditText) findViewById(R.id.EditText_Usuario);

        editText_password=(EditText) findViewById(R.id.EditText_Password);

        editText_email=(EditText)findViewById(R.id.EditText_Email);

        registrar = (Button)findViewById(R.id.btn_Registrar);

        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
                Intent intent = new Intent(Registro.this,MainActivity.class); //se llama desde le activity main al activity register
                Registro.this.startActivity(intent);
            }
        });
    }



    protected void saveData(){

        String nombre = editText_nombre.getText().toString();
        String user = editText_usuario.getText().toString();
        String password = editText_password.getText().toString();
        String email = editText_email.getText().toString();
        System.out.println("Nombre"+nombre+"User"+user+"Pas"+password);


        try{
            dataBaseHelper = new DataBaseHelper(activity);
            dataBaseHelper.open();
            dataBaseHelper.addUser(nombre,user,password,email);
            dataBaseHelper.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected  void showString ( String m){
        Toast.makeText(getApplicationContext(),m, Toast.LENGTH_SHORT).show();


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
