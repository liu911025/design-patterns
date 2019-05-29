package com.design.patterns.designpatterns.factory.abstractFactory2;

public class BMWSteeringWheelFactory implements SteeringWheelFactory {
    @Override
    public String createSteeringWheel() {
        System.out.println("创建BWM方向盘...");
        return "BWM方向盘";
    }
}
