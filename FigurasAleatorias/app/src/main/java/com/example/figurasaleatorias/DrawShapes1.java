package com.example.figurasaleatorias;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class DrawShapes1 extends Activity{
    private RandomShapeView mDrawingArea;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_shapes1);
        mDrawingArea  = (RandomShapeView)findViewById(R.id.Area);
    }

    /** Handles events for the button. Redraws the ShapeView. */
    public void redraw(View clickedButton) {
        mDrawingArea.invalidate();


    }


}
