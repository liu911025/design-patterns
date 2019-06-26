package com.design.patterns.designpatterns.visitor;

public class AlibabaCompany extends Company {

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }

    @Override
    public String entertainBelowProvincialLeader() {
        return "Alibaba 接待省领导：十菜一汤";
    }

    @Override
    public String entertainAboveNationalLeader() {
        return "Alibaba 接待郭嘉：十四菜两汤";
    }
}
