package com.design.patterns.designpatterns.facade;

/**
 * 外观模式测试
 */
public class FacadeTest {

    public static void main(String[] args) {
        Demander demander = new Demander();
        demander.demand("开发一个跟微信一样的系统");
    }

}
