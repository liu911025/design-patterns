package com.design.patterns.designpatterns.builder.soup;

/**
 * 生产方
 */
public class SoupDirector {

    public static Soup buildDongGuaPaiGuSoup() {
        SoupBuilder builder = new DongGuaPaiGuSoupBuilder();
        builder.buildSoup();
        return builder.getSoup();
    }


    public static Soup buildBanLiPaiGuSoup() {
        SoupBuilder builder = new BanLiPaiGuSoupBuilder();
        builder.buildSoup();
        return builder.getSoup();
    }
}
