package com.design.patterns.designpatterns.builder.soup;

/**
 * 冬瓜排骨汤
 */
public class DongGuaPaiGuSoup implements Soup {
    @Override
    public void addMeat() {
        System.out.println("加排骨...");
    }

    @Override
    public void addVegetables() {
        System.out.println("加冬瓜...");
    }

    @Override
    public void waitMinute(int minute) {
        System.out.println("熬制" + minute + "分钟...");
    }

    @Override
    public void addIngredients() {
        System.out.println("加盐、加香料...");
    }
}
