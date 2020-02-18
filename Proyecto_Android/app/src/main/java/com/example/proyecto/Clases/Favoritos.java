package com.example.proyecto.Clases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.proyecto.R;

public class Favoritos extends AppCompatActivity {

    private View fragmento;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favoritos);


        TextView titulo = (TextView) findViewById(R.id.TextView_titulo);
        ImageView imageView=(ImageView)findViewById(R.id.ImagenView_foto);
        TextView autor=(TextView)findViewById(R.id.TextView_autor);
        TextView genero=(TextView)findViewById(R.id.TextView_genero);



        fragmento = (View)findViewById(R.id.framgento);


    }
}
