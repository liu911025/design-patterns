package com.design.patterns.designpatterns.builder.soup;

/**
 * 煲汤接口
 */
public interface Soup {

    /** 加肉 */
    void addMeat();

    /** 加菜 */
    void addVegetables();

    /** 熬制 */
    void waitMinute(int minute);

    /** 加配料 */
    void addIngredients();

}
