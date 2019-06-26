package com.design.patterns.designpatterns.facade;

/**
 * 需求
 */
public class Demander {
    private Leader leader = new Leader();

    public void demand(String name) {
        System.out.println("提需求:" + name);
        leader.processDemand(name);
    }

}
