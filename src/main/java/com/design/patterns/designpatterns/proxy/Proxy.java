package com.design.patterns.designpatterns.proxy;

public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        preRequest();
        subject.request();
        postRequest();
    }

    private void preRequest() {
        System.out.println("Subject请求前!");
    }

    private void postRequest() {
        System.out.println("Subject请求后!");
    }

}
