package com.design.patterns.designpatterns.factory.simpleFactory;

public class GarageFactory {

    public static Vehicle getVehicle(String type) {

        if ("car".equalsIgnoreCase(type)) {
            return new Car();
        }else if ("motorcycle".equalsIgnoreCase(type)) {
            return new Motorcycle();
        }
        return null;
    }

}
