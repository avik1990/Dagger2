package com.app.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.app.dagger2.di.CarComponent;
import com.app.dagger2.di.DaggerCarComponent;
import com.app.dagger2.model.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);
        car.drive();
    }
}
