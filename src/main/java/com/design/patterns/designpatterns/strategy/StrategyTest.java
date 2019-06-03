package com.design.patterns.designpatterns.strategy;

public class StrategyTest {

    public static void main(String[] args) {
        /*WashingStrategy washingStrategy = new StandardWashingStrategy();
        WashingMachine washingMachine = new WashingMachine(washingStrategy);
        washingMachine.washingClothes();

        System.out.println("---------------------------------");
        WashingStrategy softWashingStrategy = new SoftWashingStrategy();
        washingMachine.setWashingStrategy(softWashingStrategy);
        washingMachine.washingClothes();*/

        WashingStrategy washingStrategy2 = WashingFactory.getWashingStrategy("Soft");
        WashingMachine washingMachine2 = new WashingMachine(washingStrategy2);
        washingMachine2.washingClothes();
    }
}
