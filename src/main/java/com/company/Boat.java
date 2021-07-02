package com.company;

public class Boat extends Automobile {
    private String motorType;

    public Boat(String vin, String make, String model, String motorType) {
        super(vin, make, model);
        this.motorType = motorType;
    }

    public void drive() {
        System.out.println("The " + this.getMake() + " " + this.getModel() + " sails off into the sunset");
    }
}
