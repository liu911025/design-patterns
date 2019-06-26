package com.design.patterns.designpatterns.visitor;

/**
 * 省领导
 */
public class ProvincialLeaderVistor implements Vistor {
    @Override
    public void visit(Company company) {
        System.out.println(company.entertainBelowProvincialLeader());
    }
}
