package com.design.patterns.designpatterns.factory.simpleFactory;

public class Car implements Vehicle {


    @Override
    public void running() {
        System.out.println("开汽车...");
    }
}
