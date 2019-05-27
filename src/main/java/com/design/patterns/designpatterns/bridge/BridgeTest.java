package com.design.patterns.designpatterns.bridge;

/**
 * 测试类
 */
public class BridgeTest {

    public static void main(String[] args) {

        Implementor impl = new ConcreteImplementorA();

        Abstraction abstraction = new RefinedAbstraction(impl);

        abstraction.operation();

    }
}
