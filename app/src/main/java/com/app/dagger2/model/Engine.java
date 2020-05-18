package com.app.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

public class Engine {
    @Inject
    public Engine() {
        Log.e("Engine", "Start");
    }
}
