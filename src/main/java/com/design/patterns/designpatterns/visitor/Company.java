package com.design.patterns.designpatterns.visitor;

public abstract class Company {

    abstract void accept(Vistor vistor);

    abstract String entertainBelowProvincialLeader();

    abstract String entertainAboveNationalLeader();

}
