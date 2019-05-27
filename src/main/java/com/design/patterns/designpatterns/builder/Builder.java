package com.design.patterns.designpatterns.builder;

/**
 * 抽象建造者
 */
public abstract class Builder {

    protected Product product = new Product();

    abstract void buildPartA();
    abstract void buildPartB();
    abstract void buildPartC();

    public Product getResult() {
        product.show();
        return product;
    }
}
