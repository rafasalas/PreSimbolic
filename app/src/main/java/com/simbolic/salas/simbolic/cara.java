package com.simbolic.salas.simbolic;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;

import java.util.Random;

/**
 * Created by salas on 27/07/2016.
 */
public class cara {
    partecara pelo,cejas,ojos, nariz, boca, mandibula, mano_izq, mano_der, cuello;
    public cara(Context context){
        pelo=new partecara(context);
        cejas=new partecara(context);
        ojos=new partecara(context);
        nariz=new partecara(context);
        boca=new partecara(context);
        mandibula=new partecara(context);
        mano_izq=new partecara(context);
        mano_der=new partecara(context);
        cuello=new partecara(context);
    }

    public void resize (int width, int height, double scale){

        pelo.resize(width, height,scale);

        cejas.resize(width, height,scale);

        ojos.resize(width, height,scale);

        nariz.resize(width, height,scale);

        boca.resize(width, height,scale);

        mandibula.resize(width, height,scale);
        mano_izq.resize(width, height,scale);
       mano_der.resize(width, height,scale);
       cuello.resize(width, height,scale);

    }

    public void carga(){
        Random rnd=new Random();

        //Log.v("nombre", "hair_"+ Integer.toString(rnd.nextInt(5)));

        pelo.loadsvg("hair_"+ Integer.toString(rnd.nextInt(9)));

        cejas.loadsvg("eyebrow_"+ Integer.toString(rnd.nextInt(9)));

        ojos.loadsvg("eye_"+ Integer.toString(rnd.nextInt(9)));

        nariz.loadsvg("nose_"+ Integer.toString(rnd.nextInt(9)));

        boca.loadsvg("mouth_"+ Integer.toString(rnd.nextInt(9)));

        mandibula.loadsvg("faces_"+ Integer.toString(rnd.nextInt(9)));
        mano_der.loadsvg("hand_right_"+ Integer.toString(rnd.nextInt(3)));
        mano_izq.loadsvg("hand_left_"+ Integer.toString(rnd.nextInt(3)));
        cuello.loadsvg("neck_"+ Integer.toString(rnd.nextInt(1)));
    }

    public void dibujar(Canvas canvas){

        cuello.dibujar(canvas);
        mandibula.dibujar(canvas);
        pelo.dibujar(canvas);
        cejas.dibujar(canvas);
        ojos.dibujar(canvas);
        nariz.dibujar(canvas);
        boca.dibujar(canvas);
        mano_izq.dibujar(canvas);
        mano_der.dibujar(canvas);

    }
    public void alfa(int op){
        cuello.alfa(op);
        mandibula.alfa(op);
        pelo.alfa(op);
        cejas.alfa(op);
        ojos.alfa(op);
        nariz.alfa(op);
        boca.alfa(op);
        mano_izq.alfa(op);
        mano_der.alfa(op);

    }
}
