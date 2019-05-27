package com.design.patterns.designpatterns.bridge;

/**
 * 抽象化角色
 */
public abstract class Abstraction {

    protected Implementor impl;

    protected Abstraction(Implementor impl) {
        this.impl = impl;
    }

    abstract void operation();
}
