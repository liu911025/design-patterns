package com.design.patterns.designpatterns.strategy;

/**
 * 大物件
 */
public class BigClothesWashingStrategy implements WashingStrategy {

    @Override
    public void washing() {
        System.out.println("大物流程：");
        System.out.println("[浸泡] 30 分钟");
        System.out.println("[洗涤] 3 次，每次 15 分钟");
        System.out.println("[漂洗] 2 次，每次 10 分钟");
        System.out.println("[脱水] 5 分钟");
        System.out.println("总共耗时：100 分钟");
    }
}
