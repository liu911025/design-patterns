package com.design.patterns.designpatterns.strategy;

/**
 * 轻柔
 */
public class SoftWashingStrategy implements WashingStrategy {

    @Override
    public void washing() {
        System.out.println("轻柔流程：");
        System.out.println("[浸泡] 10 分钟");
        System.out.println("[漂洗] 2 次，每次 15 分钟");
        System.out.println("[脱水] 5 分钟");
        System.out.println("总共耗时：45 分钟");
    }
}
