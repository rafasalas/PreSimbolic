package com.simbolic.salas.simbolic;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;

import android.graphics.Canvas;
import android.os.Bundle;

import android.view.Window;

public class MainActivity extends Activity {
    expositor expo;
    Canvas canvas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // Hide title bar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Context ctx = getApplicationContext();

        expo=new expositor(ctx);
        setContentView(expo);

            }



    }


