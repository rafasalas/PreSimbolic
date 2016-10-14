package com.simbolic.salas.simbolic;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;

import com.rafasalas.rafalib.vectorgraph.vectordraw;

import java.util.Random;

/**
 * Created by salas on 27/07/2016.
 */
public class mensaje {
    vectordraw icon;
    public mensaje(Context context){
        icon=new vectordraw(context);


    }

    public void resize (int width, int height, double scale, double Xini, double Yini){

        icon.resize(width, height,scale, Xini, Yini);




    }

    public void carga(){
        Random rnd=new Random();



        icon.loadsvg("icon_"+ Integer.toString(rnd.nextInt(79)));



    }
    public void carga(String nombre){




        icon.loadsvg(nombre);



    }

    public void dibujar(Canvas canvas){
        icon.dibujar(canvas);



    }
    public void alfa(int op){
        icon.alfa(op);


    }
}
