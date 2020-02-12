package com.example.figurasaleatorias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DrawingExampleLauncher extends Activity {
    public void onCreate(Bundle savedInstanceStateBundle){
        super.onCreate(savedInstanceStateBundle);
        setContentView(R.layout.activity_main);

    }

    public void launchDrawShapes1(View clickedButton) {
        Intent activityIntent = new Intent(this, DrawShapes1.class);
        startActivity(activityIntent);
    }

    public void launchDrawShapes2(View clickedButton){
        Intent activityIntent = new Intent(this,DrawShapes2.class);
        startActivity(activityIntent);
    }
}
