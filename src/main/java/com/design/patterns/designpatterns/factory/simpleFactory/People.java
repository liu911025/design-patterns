package com.design.patterns.designpatterns.factory.simpleFactory;

public class People {

    private Vehicle vehicle;

    private String name;

    public People(Vehicle vehicle, String name) {
        this.vehicle = vehicle;
        this.name = name;
    }

    public void drive() {
        System.out.print(name);
        vehicle.running();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
