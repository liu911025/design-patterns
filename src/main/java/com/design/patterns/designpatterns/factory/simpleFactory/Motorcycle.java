package com.design.patterns.designpatterns.factory.simpleFactory;

public class Motorcycle implements Vehicle {
    @Override
    public void running() {
        System.out.println("开摩托...");
    }
}
