package com.design.patterns.designpatterns.strategy;

/**
 * 洗衣机
 */
public class WashingMachine {

    private WashingStrategy washingStrategy;

    public WashingMachine(WashingStrategy washingStrategy) {
        this.washingStrategy = washingStrategy;
    }

    public void setWashingStrategy(WashingStrategy washingStrategy) {
        this.washingStrategy = washingStrategy;
    }

    public void washingClothes() {
        washingStrategy.washing();
    }
}
