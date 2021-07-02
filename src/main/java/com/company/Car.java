package com.company;

public class Car extends Automobile {
    private String driveType;

    public Car(String vin, String make, String model, String driveType) {
        super(vin, make, model);
        this.driveType = driveType;
    }

    public void drive() {
        System.out.println("The " + this.getMake() + " " + this.getModel() + " drives down the road");
    }
}
