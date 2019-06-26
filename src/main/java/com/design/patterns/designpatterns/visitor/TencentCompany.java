package com.design.patterns.designpatterns.visitor;

public class TencentCompany extends Company {

    @Override
    public void accept(Vistor vistor) {
        vistor.visit(this);
    }

    @Override
    public String entertainBelowProvincialLeader() {
        return "Tencent 接待省领导：八菜一汤";
    }

    @Override
    public String entertainAboveNationalLeader() {
        return "Tencent 接待郭嘉：十六菜两汤";
    }
}
