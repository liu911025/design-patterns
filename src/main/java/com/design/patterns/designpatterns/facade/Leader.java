package com.design.patterns.designpatterns.facade;

/**
 * 组长
 * 提供对外服务
 */
public class Leader {

    private Developer developer = new Developer();
    private Tester tester = new Tester();

    public void processDemand(String name) {
        developer.developer(name);
        tester.test(name);
    }

}
