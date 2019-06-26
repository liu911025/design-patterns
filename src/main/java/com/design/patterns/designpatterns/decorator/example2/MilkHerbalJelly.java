package com.design.patterns.designpatterns.decorator.example2;

/**
 * 牛奶龟苓膏
 */
public class MilkHerbalJelly extends HerbalJellyDecorator {

    public MilkHerbalJelly(HerbalJelly herbalJelly) {
        super(herbalJelly);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("加牛奶...");
    }
}
