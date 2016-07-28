package com.simbolic.salas.simbolic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.VectorDrawable;

/**
 * Created by salas on 26/07/2016.
 */
public class partecara {
    VectorDrawable drawable;
    Context context;
    int draw_height, draw_width;
    Rect superficie;
    Resources res;
    public partecara(Context context){
       res = context.getResources();

        superficie=new Rect();
    }
    public void loadsvg(String nombre,String carpeta,String paquete){
        //int id=res.getIdentifier(nombre, "drawable", "com.simbolic.salas.simbolic");
        int id=res.getIdentifier(nombre, carpeta, paquete);
        drawable = (VectorDrawable) res.getDrawable(id, null);
    }
    public void loadsvg(String nombre){
        int id=res.getIdentifier(nombre, "drawable", "com.simbolic.salas.simbolic");

        drawable = (VectorDrawable) res.getDrawable(id, null);}
    public void resize (int width){
        draw_height=drawable.getIntrinsicHeight();
        draw_width=drawable.getIntrinsicWidth();
        float rel=((float)width/(float)draw_width);
        superficie.set(0,0,width, (int)(draw_height*rel));
        drawable.setBounds(superficie);


    }
    public void dibujar(Canvas canvas){
        drawable.draw(canvas);

    }
    public void alfa (int opacity){drawable.setAlpha(opacity);}
}
