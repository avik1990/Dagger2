package com.app.dagger2.model;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private static final String TAG = "Car";

    private Engine engine;
    private Wheels wheels;

    @Inject
    public Car(Engine engine, Wheels wheel) {
        this.engine = engine;
        this.wheels = wheel;
    }

    public void drive() {
        Log.e(TAG, "drive");
    }

}
