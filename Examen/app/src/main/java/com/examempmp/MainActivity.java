package com.examempmp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String Datos = "pizzas";


    private Pizza[] pizzas = new Pizza[]{new Pizza("Margarita","Jamon/Queso","4€",R.drawable.pizza1),
            new Pizza("Carbonara","Beicon/Nata/Champiñones","5€",R.drawable.pizza2),
            new Pizza("Tres Quesos","3 tipos de queso","4.5€",R.drawable.pizza3)};


    private ImageView ivMargarita, ivCarbonara, ivTresQuesos;




    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ivCarbonara = findViewById(R.id.img_1);
        ivMargarita = findViewById(R.id.img_2);
        ivTresQuesos = findViewById(R.id.img_3);

        ivTresQuesos.setOnClickListener(this);
        ivMargarita.setOnClickListener(this);
        ivCarbonara.setOnClickListener(this);


        @Override
        public void onClick(View view) {
            Bundle bundle = new Bundle();
            //Hago un switch con las ID de los elementos que se pueden tocar

}
