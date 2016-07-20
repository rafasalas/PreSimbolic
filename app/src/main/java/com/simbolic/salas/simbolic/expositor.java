package com.simbolic.salas.simbolic;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
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
        Resources res = getResources();
        String erpelo="pelo";
        int idpelo=res.getIdentifier(erpelo, "drawable", "com.simbolic.salas.simbolic");
        VectorDrawable drawable = (VectorDrawable) res.getDrawable(R.drawable.test);
        VectorDrawable drawable2 = (VectorDrawable) res.getDrawable(idpelo);
        canvas.drawColor(0xFFFF0000);
        drawable.setBounds(0,0,500,800);
        drawable2.setBounds(20,20,100,100);
        drawable.draw(canvas);
        drawable2.draw(canvas);

        update();
        invalidate();
    }
   protected void update(){

   }

}
