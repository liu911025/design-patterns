package com.design.patterns.designpatterns.composite;

/**
 * 组合模式
 */
public class CompositeTest {

    public static void main(String[] args) {
        Leader manager = new Leader("大米");

        Leader leader = new Leader("中米");

        Engineer engineer1 = new Engineer("小米1");
        Engineer engineer2 = new Engineer("小米2");

        manager.add(leader);
        leader.add(engineer1);
        leader.add(engineer2);

        manager.display(0);
    }

}
