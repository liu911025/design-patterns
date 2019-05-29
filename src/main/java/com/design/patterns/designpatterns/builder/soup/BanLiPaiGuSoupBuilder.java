package com.design.patterns.designpatterns.builder.soup;

/**
 * 板栗排骨汤熬制者
 */
public class BanLiPaiGuSoupBuilder implements SoupBuilder {

    private BanLiPaiGuSoup banLiPaiGuSoup = new BanLiPaiGuSoup();

    @Override
    public void buildSoup() {
        System.out.println("板栗排骨汤熬制开始...");
        banLiPaiGuSoup.addMeat();
        banLiPaiGuSoup.addVegetables();
        banLiPaiGuSoup.waitMinute(40);
        banLiPaiGuSoup.addIngredients();
        System.out.println("板栗排骨汤熬制完成...");
    }

    @Override
    public Soup getSoup() {
        return banLiPaiGuSoup;
    }
}
