package com.simbolic.salas.simbolic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.Log;
import android.view.View;

import java.util.Random;

/**
 * Created by salas on 20/07/2016.
 */


public class expositor extends View {
            partecara Globo;
            mensaje Mensaje;
            cara Cara1;
            //Color temporal
            int r,g,b;
            Color color;
            //Color Temporal



    int contador,opacidad, intervalo, transicion, incremento;
    public expositor(Context context){
            super(context);
        Cara1=new cara(context);
        Globo=new partecara (context);
        Mensaje=new mensaje(context);
        Cara1.carga();
        Mensaje.carga();
        Globo.loadsvg("globo_1");
        contador=0;
        opacidad=0;
        intervalo=250;
        transicion=50;
        incremento=(int)((float)255/(float)transicion);
        // Color (Temporal)
        Random rnd=new Random();
        r=rnd.nextInt(255);
         g=rnd.nextInt(255);
         b=rnd.nextInt(255);
        Color color = new Color();

        // Color Temporal
    }
    @Override

    protected void onDraw(Canvas canvas){
        Paint fondopaint;
        fondopaint=new Paint();
        Random rnd=new Random();
        if (contador==intervalo){
            contador=0;
            opacidad=0;
            Cara1.carga();
            Mensaje.carga();
            opacidad=0;
            // Color (Temporal)
            r=rnd.nextInt(255);
            g=rnd.nextInt(255);
            b=rnd.nextInt(255);
            // Color Temporal


        }
        if (contador<transicion){opacidad=opacidad+incremento;}
        if (contador==transicion){opacidad=255;}
        if (contador>intervalo-transicion){opacidad=opacidad-incremento;}
        int width=getWidth();
        int height=getHeight();

        Cara1.resize(width, height,0.75);
        Globo.resize(width,height,.45,.45,.15);
        Mensaje.resize(width, height,.15,.60,.25
        );

       // canvas.drawColor(0xFFFFFFFF);
        //fondopaint.setShader(new RadialGradient(width / 2, height / 2, width , 0xffffffff, 0xff555555, Shader.TileMode.MIRROR));
        fondopaint.setShader(new RadialGradient(width / 2, height / 2, width , 0xffffffff, color.argb(opacidad,r,g,b), Shader.TileMode.MIRROR));
        //Cara1.alfa(opacidad);
        //Globo.alfa(opacidad);
        //Mensaje.alfa(opacidad);
        Cara1.colorize(opacidad, r,g,b);
        Globo.alfa(opacidad);
        Mensaje.alfa(opacidad);
        canvas.drawPaint(fondopaint);

        Cara1.dibujar(canvas);
        Globo.dibujar(canvas);
        Mensaje.dibujar(canvas);
        update();
        invalidate();
        contador++;
    }
   protected void update(){

   }

}
