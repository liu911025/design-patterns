package com.design.patterns.designpatterns.decorator.example2;

/**
 * 蜂蜜龟苓膏
 */
public class HoneyHerbalJelly extends HerbalJellyDecorator {

    public HoneyHerbalJelly(HerbalJelly herbalJelly) {
        super(herbalJelly);
    }

    @Override
    public void process() {
        super.process();
        System.out.println("加蜂蜜...");
    }
}
