package com.example.proyecto.Base_Datos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.proyecto.R;

public class Registro extends AppCompatActivity /*implements View.OnClickListener*/ {


    private final AppCompatActivity activity = Registro.this;
    private TextView textView_nombre;
    private TextView textView_edad;
    private TextView textView_usuario;
    private TextView textView_contraseña;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
    }

    public static class Usuario extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_usuario);


        }
    }
}
