package com.design.patterns.designpatterns.state;

/**
 * 游客
 */
public class NoneState implements State {

    @Override
    public void register() {
        System.out.println("游客。注册中。。。");
    }

    @Override
    public void apply() {
        System.out.println("游客。不能申请授信。");
    }

    @Override
    public void draw(double money) {
        System.out.println("游客。申请借款【" + money + "】元。不能申请借款。");
    }
}
