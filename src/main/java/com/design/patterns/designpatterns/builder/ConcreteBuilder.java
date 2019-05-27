package com.design.patterns.designpatterns.builder;

public class ConcreteBuilder extends Builder {
    @Override
    void buildPartA() {
        product.setPartA("具体零件A");
    }

    @Override
    void buildPartB() {
        product.setPartB("具体零件B");
    }

    @Override
    void buildPartC() {
        product.setPartC("具体零件C");
    }
}
