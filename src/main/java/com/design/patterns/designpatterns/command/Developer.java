package com.design.patterns.designpatterns.command;

/**
 * 开发人员
 */
public class Developer {

    private String name;

    public Developer(String name) {
        this.name = name;
    }

    public void develop(Requirement requirement) {
        System.out.println(this.name + " 开始开发需求：" + requirement.getName());
    }

    public void suspend(Requirement requirement) {
        System.out.println(this.name + " 停止开发需求：" + requirement.getName());
    }

    public String getName() {
        return name;
    }

}
