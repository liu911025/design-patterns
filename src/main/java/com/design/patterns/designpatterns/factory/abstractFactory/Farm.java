package com.design.patterns.designpatterns.factory.abstractFactory;

/**
 * 农场接口
 */
public interface Farm {

    Animal newAnimal();
    Plant newPlant();

}
