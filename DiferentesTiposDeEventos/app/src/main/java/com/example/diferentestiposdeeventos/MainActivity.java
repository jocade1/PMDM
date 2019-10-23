package com.example.diferentestiposdeeventos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void miMetodo(View v){
        Toast.makeText(this, "Pulsado boton dos",
                Toast.LENGTH_SHORT).show();
    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button miBotton = this.findViewById(R.id.bt3);

        miBotton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Pulsando boton tres", Toast.LENGTH_SHORT).show();

            }



        });

    }
}

