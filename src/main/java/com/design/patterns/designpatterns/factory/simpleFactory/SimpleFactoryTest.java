package com.design.patterns.designpatterns.factory.simpleFactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        Vehicle car = GarageFactory.getVehicle("car");
        People people = new People(car, "小明");
        people.drive();
        System.out.println("-----------------------");

        Vehicle motorcycle = GarageFactory.getVehicle("motorcycle");
        people.setVehicle(motorcycle);
        people.drive();
    }

}
