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

    public expositor(Context context){
            super(context);

    }
    @Override

    protected void onDraw(Canvas canvas){

        int width=getWidth();
        int height=getHeight();
        Rect pantalla;
        pantalla=new Rect();



        Resources res = getResources();
        String erpelo="pelo1";
        int idpelo=res.getIdentifier(erpelo, "drawable", "com.simbolic.salas.simbolic");
        VectorDrawable drawable = (VectorDrawable) res.getDrawable(R.drawable.test1, null);
        VectorDrawable drawable2 = (VectorDrawable) res.getDrawable(idpelo, null);
        int draw_height=drawable.getIntrinsicHeight();
        int draw_width=drawable.getIntrinsicWidth();
        float rel=((float)width/(float)draw_width);
        pantalla.set(0,0,width, (int)(draw_height*rel));
        //Log.i("dim","w "+width);
        //Log.i("dim","h "+(int)(height));
       // Log.i("dim","dw "+draw_width);
       // Log.i("dim","dh "+(int)(draw_height));
        //Log.i("dim","rel "+ rel);
        canvas.drawColor(0xFFFFFFFF);
        drawable.setBounds(pantalla);
        drawable2.setBounds(pantalla);
        drawable.draw(canvas);
        drawable2.draw(canvas);

        update();
        invalidate();
    }
   protected void update(){

   }

}
