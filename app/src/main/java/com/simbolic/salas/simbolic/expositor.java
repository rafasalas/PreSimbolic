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
            cara Cara1;
    public expositor(Context context){
            super(context);
        Cara1=new cara(context);

    }
    @Override

    protected void onDraw(Canvas canvas){

        int width=getWidth();
        int height=getHeight();
        Cara1.carga();
        Cara1.resize(width);


        canvas.drawColor(0xFFFFFFFF);
        Cara1.dibujar(canvas);

        update();
        invalidate();
    }
   protected void update(){

   }

}
