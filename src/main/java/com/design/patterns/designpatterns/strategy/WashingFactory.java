package com.design.patterns.designpatterns.strategy;

/**
 * 洗衣店 (简单工厂模式)
 * 将具体实现封装,不暴露用户
 */
public class WashingFactory {

    public static WashingStrategy getWashingStrategy(String type) {
        if ("Quick".equals(type)) {
            return new QuickWashingStrategy();
        }
        if ("BigClothes".equals(type)) {
            return new BigClothesWashingStrategy();
        }
        if ("Soft".equals(type)) {
            return new SoftWashingStrategy();
        }
        return new StandardWashingStrategy();
    }

}
