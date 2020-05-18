package com.app.dagger2.model;

import javax.inject.Inject;

public class Wheels {

    Rims rims;
    Tires tires;

    public Wheels(Rims rims, Tires tires) {
        this.rims = rims;
        this.tires = tires;
    }
}
