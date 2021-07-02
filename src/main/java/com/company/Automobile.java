package com.company;

public abstract class Automobile {
    private String vin;
    private String make;
    private String model;

    public Automobile(String vin, String make, String model) {
        this.vin = vin;
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public abstract void drive();
}
