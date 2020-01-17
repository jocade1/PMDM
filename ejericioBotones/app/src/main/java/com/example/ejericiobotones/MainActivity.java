package com.example.ejericiobotones;



import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements OnClickListener {

    private ImageButton imagenBRed, imagenBBlue;
    private TextView tvColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imagenBRed = findViewById(R.id.imagenBRed);
        imagenBBlue = findViewById(R.id.imagenBBlue);
        tvColor = findViewById(R.id.tvColor);

        imagenBRed.setOnClickListener(this);
        imagenBBlue.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.imagenBBlue:
                tvColor.setBackgroundColor(Color.BLUE);
                break;
            case R.id.imagenBRed:
                tvColor.setBackgroundColor(Color.RED);
                break;
        }
    }
}