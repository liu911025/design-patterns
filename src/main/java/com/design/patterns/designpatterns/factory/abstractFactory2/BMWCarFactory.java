package com.design.patterns.designpatterns.factory.abstractFactory2;

public class BMWCarFactory implements AbstractCarFactory {

    @Override
    public void installWheel() {
        BMWWheelFactory bwmWheelFactory = new BMWWheelFactory();
        String wheel = bwmWheelFactory.createWheel();
        System.out.println("BWM安装" + wheel);
    }

    @Override
    public void installSteeringWheel() {
        BMWSteeringWheelFactory bmwSteeringWheelFactory = new BMWSteeringWheelFactory();
        String steeringWheel = bmwSteeringWheelFactory.createSteeringWheel();
        System.out.println("BWM安装" + steeringWheel);
    }
}
