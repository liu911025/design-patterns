package com.design.patterns.designpatterns.intermediary;

import java.util.List;

/**
 * 租客
 */
public class Tenant {

    private String name;

    private List<String> types;

    private Mediator mediator;

    public Tenant(String name, List<String> types) {
        this.name = name;
        this.types = types;
        this.mediator = new RentingMediator();
    }

    public void lookHouse() {
        System.out.println(name + "去看房...");
        mediator.supplyHouse(types);
    }
}
