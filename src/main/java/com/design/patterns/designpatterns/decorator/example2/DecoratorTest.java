package com.design.patterns.designpatterns.decorator.example2;

/**
 * 装饰者模式测试
 */
public class DecoratorTest {

    public static void main(String[] args) {
        CommonHerbalJelly common = new CommonHerbalJelly();
        HoneyHerbalJelly honey = new HoneyHerbalJelly(common);
        honey.process();

        System.out.println("------------------------");
        MilkHerbalJelly milk = new MilkHerbalJelly(honey);
        milk.process();
    }

}
