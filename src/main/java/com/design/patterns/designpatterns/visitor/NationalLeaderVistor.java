package com.design.patterns.designpatterns.visitor;

/**
 * 郭嘉领导
 */
public class NationalLeaderVistor implements Vistor {
    @Override
    public void visit(Company company) {
        System.out.println(company.entertainAboveNationalLeader());
    }
}
