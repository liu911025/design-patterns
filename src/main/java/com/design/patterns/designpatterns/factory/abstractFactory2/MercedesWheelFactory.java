package com.design.patterns.designpatterns.factory.abstractFactory2;

public class MercedesWheelFactory implements WheelFactory {
    @Override
    public String createWheel() {
        System.out.println("创建Mercedes轮胎");
        return "Mercedes轮胎";
    }
}
