package com.design.patterns.designpatterns.flyweight;

/**
 * 享元模式测试
 */
public class FlyweightTest {

    public static void main(String[] args) {
        drawByXiaoMing();
        drawByXiaoHong();
    }

    public static void drawByXiaoMing() {
        ICrayon greenCrayon = CrayonFactory.getCrayon("绿色");
        greenCrayon.draw("草");

        ICrayon grayCrayon = CrayonFactory.getCrayon("灰色");
        grayCrayon.draw("路");
    }

    public static void drawByXiaoHong() {
        ICrayon blueCrayon = CrayonFactory.getCrayon("蓝色");
        blueCrayon.draw("蓝天");

        ICrayon greenCrayon = CrayonFactory.getCrayon("绿色");
        greenCrayon.draw("树");
    }
}
