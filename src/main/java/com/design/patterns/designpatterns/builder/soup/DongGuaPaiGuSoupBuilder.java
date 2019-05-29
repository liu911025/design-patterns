package com.design.patterns.designpatterns.builder.soup;

/**
 * 冬瓜排骨汤熬制者
 */
public class DongGuaPaiGuSoupBuilder implements SoupBuilder {

    private DongGuaPaiGuSoup dongGuaPaiGuSoup = new DongGuaPaiGuSoup();

    @Override
    public void buildSoup() {
        System.out.println("冬瓜排骨汤熬制开始...");
        dongGuaPaiGuSoup.addMeat();
        dongGuaPaiGuSoup.waitMinute(30);
        dongGuaPaiGuSoup.addVegetables();
        dongGuaPaiGuSoup.waitMinute(10);
        dongGuaPaiGuSoup.addIngredients();
        System.out.println("冬瓜排骨汤熬制完成...");
    }

    @Override
    public Soup getSoup() {
        return dongGuaPaiGuSoup;
    }
}
