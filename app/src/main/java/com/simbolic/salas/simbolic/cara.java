package com.simbolic.salas.simbolic;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;

import java.util.Random;

/**
 * Created by salas on 27/07/2016.
 */
public class cara {
    partecara pelo,cejas,ojos, nariz, boca, mandibula;
    public cara(Context context){
        pelo=new partecara(context);
        cejas=new partecara(context);
        ojos=new partecara(context);
        nariz=new partecara(context);
        boca=new partecara(context);
        mandibula=new partecara(context);

    }

    public void resize (int width, int height, double scale){

        pelo.resize(width, height,scale);

        cejas.resize(width, height,scale);

        ojos.resize(width, height,scale);

        nariz.resize(width, height,scale);

        boca.resize(width, height,scale);

        mandibula.resize(width, height,scale);


    }

    public void carga(){
        Random rnd=new Random();

        //Log.v("nombre", "hair_"+ Integer.toString(rnd.nextInt(5)));

        pelo.loadsvg("hair_"+ Integer.toString(rnd.nextInt(5)));

        cejas.loadsvg("eyebrow_"+ Integer.toString(rnd.nextInt(5)));

        ojos.loadsvg("eyes_"+ Integer.toString(rnd.nextInt(6)));

        nariz.loadsvg("nose_"+ Integer.toString(rnd.nextInt(4)));

        boca.loadsvg("mouth_"+ Integer.toString(rnd.nextInt(6)));

        mandibula.loadsvg("faces_"+ Integer.toString(rnd.nextInt(5)));

    }

    public void dibujar(Canvas canvas){
        mandibula.dibujar(canvas);

        pelo.dibujar(canvas);
        cejas.dibujar(canvas);
        ojos.dibujar(canvas);
        nariz.dibujar(canvas);
        boca.dibujar(canvas);

    }
    public void alfa(int op){
        mandibula.alfa(op);
        pelo.alfa(op);
        cejas.alfa(op);
        ojos.alfa(op);
        nariz.alfa(op);
        boca.alfa(op);

    }
}
