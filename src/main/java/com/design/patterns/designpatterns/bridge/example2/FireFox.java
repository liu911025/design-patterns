package com.design.patterns.designpatterns.bridge.example2;

public class FireFox implements SoftWare {
    @Override
    public void open(Phone phone) {
        System.out.println("打开 " + phone.getSystem() + " 手机的 Firefox 浏览器");
    }
}
