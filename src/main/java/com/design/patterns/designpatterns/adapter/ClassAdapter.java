package com.design.patterns.designpatterns.adapter;

/**
 * 类适配器
 */
public class ClassAdapter extends Adaptee implements Target {

    @Override
    public void request() {
        System.out.println("类适配器---start");
        specificRequest();
        System.out.println("类适配器---end");
    }
}
