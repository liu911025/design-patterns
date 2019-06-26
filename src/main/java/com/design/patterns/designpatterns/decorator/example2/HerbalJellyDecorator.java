package com.design.patterns.designpatterns.decorator.example2;

/**
 * 龟苓膏装饰者
 */
public class HerbalJellyDecorator extends HerbalJelly{

    private HerbalJelly herbalJelly;

    public HerbalJellyDecorator(HerbalJelly herbalJelly) {
        this.herbalJelly = herbalJelly;
    }

    @Override
    public void process() {
        this.herbalJelly.process();
    }
}
