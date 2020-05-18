package com.app.dagger2.di;

import com.app.dagger2.MainActivity;
import com.app.dagger2.model.Car;
import com.app.dagger2.model.WheelsModule;

import dagger.Component;

@Component (modules = WheelsModule.class)
public interface CarComponent {
    Car getCar();
    void inject(MainActivity mainActivity);
}

