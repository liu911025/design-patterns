package com.design.patterns.designpatterns.intermediary;

/**
 * 小区房房东
 */
public class XiaoQuFangLandlord implements Landlord {

    @Override
    public void supply() {
        System.out.println("提供小区房...");
    }
}
