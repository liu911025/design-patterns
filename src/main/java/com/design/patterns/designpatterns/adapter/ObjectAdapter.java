package com.design.patterns.designpatterns.adapter;

/**
 * 对象适配器
 */
public class ObjectAdapter implements Target{

    private Adaptee adaptee;

    public ObjectAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        System.out.println("对象适配器---start");
        adaptee.specificRequest();
        System.out.println("对象适配器---end");
    }
}
