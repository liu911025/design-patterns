package com.design.patterns.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private List<Company> companies = new ArrayList<>();

    public void entertain(Vistor vistor) {
        for (Company company : companies) {
            company.accept(vistor);
        }
    }

    public void add(Company company) {
        companies.add(company);
    }

}
