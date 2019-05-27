package com.design.patterns.designpatterns.proxy;

public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject 请求!");
    }
}
