package com.design.patterns.designpatterns.factory.abstractFactory2;

public class MercedesSteeringWheelFactory implements SteeringWheelFactory {

    @Override
    public String createSteeringWheel() {
        System.out.println("创建Mercedes方向盘...");
        return "Mercedes方向盘";
    }
}
