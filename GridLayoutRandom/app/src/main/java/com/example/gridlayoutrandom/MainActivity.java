package com.example.gridlayoutrandom;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private int [] imageid={R.id.image1,R.id.image2,R.id.image3,R.id.image4,R.id.image5,
            R.id.image6,R.id.image7,R.id.image8,R.id.image9};

    private int [] imageViews={R.drawable.cochedosrueda,R.drawable.aeronave,R.drawable.bicicleta,
    R.drawable.doscanoas,R.drawable.moto,R.drawable.patinete,R.drawable.tren1,R.drawable.phaeton,R.drawable.submarino};

    private ImageView [] imagenes;

    private ImageView imageresoult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageresoult=(ImageView)findViewById(R.id.result);
        imagenes=new ImageView[9];

        for(int i=0;i<9;i++){//coges los id de las imagenes

            imagenes[i]=(ImageView)findViewById(imageid[i]);
            imagenes[i].setImageResource(imageViews[RandomUtlils.randomInt(imageViews.length)]);
        }

        for(int i=0;i<9;i++){//Clickas en cada imagen
            final int finalI = i;
            imagenes[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String m="Has clickado=> "+imageViews[finalI];
                    imageresoult.setImageResource(imageViews[RandomUtlils.randomInt(imageViews.length)]);//Coge los drawables y lo ponen en ImageView para mostrar la imagen lo hace aleatoriamente
                    Toast.makeText(getApplicationContext(),m,Toast.LENGTH_SHORT).show();
                }
            });
        }


    }

}
class RandomUtlils{

    private static Random r=new Random();
    public static int randomInt(int range){
        return (r.nextInt(range));
    }
    public static int randomIndex(Object[]array){
        return (randomInt(array.length));
    }
    public static <Object> Object randomElement(Object[]array){
        return (array[randomIndex(array)]);
    }
    public static float randomFloat(int n){
        return ((float)Math.random()*n);
    }

}
