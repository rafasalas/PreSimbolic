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
    int contador,opacidad;
    public expositor(Context context){
            super(context);
        Cara1=new cara(context);
        Cara1.carga();
        contador=0;
        opacidad=0;
    }
    @Override

    protected void onDraw(Canvas canvas){
        if (contador==80){
            contador=0;
            opacidad=0;
            Cara1.carga();
            Cara1.alfa(0);
        }
        if (contador<25){opacidad=opacidad+10;}
        if (contador==25){opacidad=255;}
        if (contador>55){opacidad=opacidad-10;}
        int width=getWidth();
        int height=getHeight();

        Cara1.resize(width);


        canvas.drawColor(0xFFFFFFFF);
        Cara1.alfa(opacidad);
        Cara1.dibujar(canvas);

        update();
        invalidate();
        contador++;
    }
   protected void update(){

   }

}
