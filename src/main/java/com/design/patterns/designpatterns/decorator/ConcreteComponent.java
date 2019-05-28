package com.design.patterns.designpatterns.decorator;


/**
 * 具体构件角色
 */
public class ConcreteComponent implements Component  {

    public ConcreteComponent() {
        System.out.println("创建ConcreteComponent");
    }

    @Override
    public void operation() {
        System.out.println("调用创建ConcreteComponent的方法operation()");
    }
}
