package com.design.patterns.designpatterns.decorator;

/**
 * 装饰者测试类
 */
public class DecoratorTest {

    public static void main(String[] args) {
        Component p=new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();
    }

}
