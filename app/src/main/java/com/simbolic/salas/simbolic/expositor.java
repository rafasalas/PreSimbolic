package com.simbolic.salas.simbolic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
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
        Paint fondopaint;
        fondopaint=new Paint();
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

        Cara1.resize(width, height,0.5);


       // canvas.drawColor(0xFFFFFFFF);
        fondopaint.setShader(new RadialGradient(width / 2, height / 2, width , 0xffffffff, 0xff555555, Shader.TileMode.MIRROR));
        Cara1.alfa(opacidad);
        canvas.drawPaint(fondopaint);
        Cara1.dibujar(canvas);

        update();
        invalidate();
        contador++;
    }
   protected void update(){

   }

}
