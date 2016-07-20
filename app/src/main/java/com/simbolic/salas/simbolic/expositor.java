package com.simbolic.salas.simbolic;

import android.content.Context;
import android.graphics.Canvas;
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

        canvas.drawColor(0xFFFF0000);


        //update();
        invalidate();
    }
}
