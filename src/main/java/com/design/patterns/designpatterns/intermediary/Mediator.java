package com.design.patterns.designpatterns.intermediary;

import java.util.List;

/**
 * 中介抽象类
 */
public abstract class Mediator {

    /**
     * 中介提供房型
     * @param types
     */
    abstract void supplyHouse(List<String> types);

}
