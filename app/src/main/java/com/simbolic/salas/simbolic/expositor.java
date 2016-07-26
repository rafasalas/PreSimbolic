package com.simbolic.salas.simbolic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.Log;
import android.view.View;

/**
 * Created by salas on 20/07/2016.
 */


public class expositor extends View {
            partecara pelo;
    public expositor(Context context){
            super(context);
        pelo=new partecara("pelo1", context);

    }
    @Override

    protected void onDraw(Canvas canvas){

        int width=getWidth();
        int height=getHeight();
        pelo.loadsvg("pelo1");
        pelo.resize(width);


        canvas.drawColor(0xFFFFFFFF);
        pelo.dibujar(canvas);
        update();
        invalidate();
    }
   protected void update(){

   }

}
