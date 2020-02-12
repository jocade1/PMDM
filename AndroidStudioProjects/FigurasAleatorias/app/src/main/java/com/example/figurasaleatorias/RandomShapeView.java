package com.example.figurasaleatorias;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.service.notification.NotificationListenerService;
import android.util.AttributeSet;
import android.view.View;

import java.util.jar.Attributes;



public class RandomShapeView extends View  {
    private Integer[] mBackgrounds = {Color.CYAN,Color.GRAY,Color.LTGRAY,Color.MAGENTA,Color.YELLOW,Color.WHITE};

    private Paint[] mForegrounds = {makePaint(Color.BLACK),makePaint(Color.BLUE),makePaint(Color.GREEN),makePaint(Color.RED)};

    private Bitmap[] mPics = {
            makeBitmap(R.drawable.emo_im_angel),
            makeBitmap(R.drawable.emo_im_cool),
            makeBitmap(R.drawable.emo_im_crying),
            makeBitmap(R.drawable.emo_im_happy),
            makeBitmap(R.drawable.emo_im_yelling)
    };
    private String mMessage = "Android";

    public RandomShapeView(Context context) {
        super(context);
    }

    public RandomShapeView(Context context, AttributeSet attrs) {
        super(context,attrs);
    }

    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        canvas.drawColor(RandomUtils.randomElement(mBackgrounds));
        int viewWidth = getWidth();
        int viewHeight = getHeight();
        int avgShapeWidth = viewWidth/5;
        for(int i =0; i<20 ; i++) {
            drawRandowCicle(canvas, viewWidth,viewHeight,avgShapeWidth);
            drawRandowRec(canvas, viewWidth,viewHeight,avgShapeWidth);
            drawRandowBitmap(canvas, viewWidth,viewHeight,avgShapeWidth);
            drawRandowText(canvas, viewWidth,viewHeight,avgShapeWidth);

        }
    }

    private Paint makePaint(int color){
        Paint p =  new Paint();
        p.setColor(color);
        return p;
    }

    private Bitmap makeBitmap(int bitmap){
        return (BitmapFactory.decodeResource(getResources(),bitmap));
    }

    private void drawRandowCicle(Canvas canvas, int viewWidth,int viewHeight, int avgSapeWidth){
        float x = RandomUtils.randomFloat(viewWidth);
        float y = RandomUtils.randomFloat(viewHeight);
        float radius = RandomUtils.randomFloat(avgSapeWidth);
        Paint circleColor = RandomUtils.randomElement(mForegrounds);
        canvas.drawCircle(x,y,radius,circleColor);
    }

    private void drawRandowRec(Canvas canvas, int viewWidth,int viewHeight, int avgSapeWidth){
        float left = RandomUtils.randomFloat(viewWidth);
        float top = RandomUtils.randomFloat(viewHeight);
        float width = RandomUtils.randomFloat(avgSapeWidth);
        float right = left+width;
        float bottom = top+width;
        Paint squareColor = RandomUtils.randomElement(mForegrounds);
        canvas.drawRect(left,top,right,bottom,squareColor);
    }


    private void drawRandowBitmap(Canvas canvas, int viewWidth,int viewHeight, int avgSapeWidth){

        float left = RandomUtils.randomFloat(viewWidth);
        float top = RandomUtils.randomFloat(viewHeight);
        Bitmap pic = RandomUtils.randomElement(mPics);
        canvas.drawBitmap(pic,left,top,null);

    }

    private void drawRandowText(Canvas canvas, int viewWidth,int viewHeight, int avgSapeWidth){
        float x  = RandomUtils.randomFloat(viewWidth);
        float y = RandomUtils.randomFloat(viewHeight);
        float textSize = RandomUtils.randomFloat(avgSapeWidth);
        Paint textPaint = RandomUtils.randomElement(mForegrounds);
        textPaint.setTextSize(textSize);
        canvas.drawText(mMessage,x,y,textPaint);



    }



}







