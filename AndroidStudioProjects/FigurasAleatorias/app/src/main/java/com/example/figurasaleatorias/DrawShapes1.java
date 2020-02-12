package com.example.figurasaleatorias;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class DrawShapes1 extends Activity {
    private RandomShapeView mDrawingArea;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_shape1);
        mDrawingArea =(RandomShapeView)findViewById(R.id.drawing_area);
    }

    public void redraw(View clickedButton){
        mDrawingArea.invalidate();
    }
}
