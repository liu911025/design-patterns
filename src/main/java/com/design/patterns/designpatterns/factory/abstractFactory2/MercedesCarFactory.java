package com.design.patterns.designpatterns.factory.abstractFactory2;

public class MercedesCarFactory implements AbstractCarFactory {

    @Override
    public void installWheel() {
        MercedesWheelFactory mercedesWheelFactory = new MercedesWheelFactory();
        String wheel = mercedesWheelFactory.createWheel();
        System.out.println("Mercedes安装" + wheel);
    }

    @Override
    public void installSteeringWheel() {
        MercedesSteeringWheelFactory mercedesSteeringWheelFactory = new MercedesSteeringWheelFactory();
        String steeringWheel = mercedesSteeringWheelFactory.createSteeringWheel();
        System.out.println("Mercedes安装" + steeringWheel);
    }
}
