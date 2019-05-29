package com.design.patterns.designpatterns.intermediary;

/**
 * 农民房房东
 */
public class NongMinFangLandlord implements Landlord {

    @Override
    public void supply() {
        System.out.println("提供农民房...");
    }
}
