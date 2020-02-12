package com.example.spinnerpersona;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public Spinner miSpinner;
    private Persona[] personas = new Persona[]{
        new Persona("Jose", "Cámara",23), new Persona("Javier","Gonzalez",45),new Persona("Alba","Garcia",28)};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        miSpinner = (Spinner)findViewById(R.id.spPersona);



    }
}
