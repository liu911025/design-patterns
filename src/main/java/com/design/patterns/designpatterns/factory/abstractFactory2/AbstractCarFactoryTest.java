package com.design.patterns.designpatterns.factory.abstractFactory2;

public class AbstractCarFactoryTest {

    public static void main(String[] args) {
        AbstractCarFactory bwmFactory = new BMWCarFactory();
        bwmFactory.installWheel();
        bwmFactory.installSteeringWheel();

        System.out.println("-----------------------------------");
        AbstractCarFactory mercedesCarFactory = new MercedesCarFactory();
        mercedesCarFactory.installWheel();
        mercedesCarFactory.installSteeringWheel();

    }

}
