package com.design.patterns.designpatterns.observable;

public class ObserverTest {

    public static void main(String[] args) {
        User xiaoMing = new User("小明");
        User xiaoHong = new User("小红");
        User xiaoDong = new User("小东");
        xiaoMing.addObserver(xiaoHong);
        xiaoMing.addObserver(xiaoDong);
        xiaoMing.sendMessage("今天真开心");

        System.out.println("-------------------------------------");

        xiaoMing.removeObserver(xiaoHong);
        xiaoMing.sendMessage("希望明天也像今天一样开心");

        System.out.println("-------------------------------------");


        xiaoHong.addObserver(xiaoMing);
        xiaoHong.addObserver(xiaoDong);
        xiaoHong.sendMessage("今天和小明吵架了，屏蔽他的朋友圈");

        System.out.println("-------------------------------------");

        xiaoDong.addObserver(xiaoMing);
        xiaoDong.addObserver(xiaoHong);
        xiaoDong.sendMessage("小明和小红吵架了，夹在中间好尴尬");
    }
}
