package com.simbolic.salas.simbolic;

import android.content.Context;
import android.graphics.Canvas;

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

    public void resize (int width){

        pelo.resize(width);

        cejas.resize(width);

        ojos.resize(width);

        nariz.resize(width);

        boca.resize(width);

        mandibula.resize(width);


    }

    public void carga(){
        pelo.loadsvg("hair_5");

        cejas.loadsvg("eyebrow_10");

        ojos.loadsvg("eyes_4");

        nariz.loadsvg("nose_3");

        boca.loadsvg("mouth_5");

        mandibula.loadsvg("faces_4");

    }

    public void dibujar(Canvas canvas){
        pelo.dibujar(canvas);
        cejas.dibujar(canvas);
        ojos.dibujar(canvas);
        nariz.dibujar(canvas);
        boca.dibujar(canvas);
        mandibula.dibujar(canvas);

    }

}
