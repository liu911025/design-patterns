package com.design.patterns.designpatterns.factory.abstractFactory2;

public class BMWWheelFactory implements WheelFactory {
    @Override
    public String createWheel() {
        System.out.println("创建BMW轮胎...");
        return "BMW轮胎";
    }
}
