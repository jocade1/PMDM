package com.example.recopilatorioexamen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static int imgDigits[] = {R.id.img_11,R.id.img_12, R.id.img_13};
    int tiposMedio[]  = {R.drawable.patinete, R.drawable.bicis, R.drawable.coches};
    ImageView imagenes[];
    ImageView imgElegida;
    TextView textoElegido;
    Button miBoton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textoElegido=(TextView)findViewById(R.id.txtResul);
        imgElegida=(ImageView) findViewById(R.id.imgResul);

        imagenes = new ImageView[3];
        for(int i =0;i<imagenes.length;i++)
            imagenes[i] = (ImageView) findViewById(imgDigits[i]);

        for(int i= 0; i<3;i++)
            imagenes[i].setOnClickListener(new MiEleccion());

        miBoton =(Button)findViewById(R.id.btn);
        miBoton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent miIntent = new Intent(MainActivity.this,)
            }



            @Override
            public void onClick(View v) {

            }
        });

    }
}
