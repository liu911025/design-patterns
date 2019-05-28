package com.design.patterns.designpatterns.decorator;


/**
 * 具体装饰角色
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        addedFunction();
        super.operation();
    }

    private void addedFunction() {
        System.out.println("为具体构件角色增加额外的功能addedFunction()");
    }

}
