package com.design.patterns.designpatterns.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 领导
 */
public class Leader extends Employee {

    private List<Employee> employees;

    public Leader(String name) {
        this.setName(name);
        this.employees = new LinkedList<>();
    }

    public void add(Employee employee) {
        this.employees.add(employee);
    }

    @Override
    public void display(int index) {
        for (int i = 0; i < index; i++) {
            System.out.print("---");
        }
        System.out.println("领导:" + this.getName());
        employees.forEach(employee -> employee.display(index + 1));
    }
}
