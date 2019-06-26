package com.design.patterns.designpatterns.composite;

import lombok.Data;

/**
 * 职员
 */
@Data
public abstract class Employee {

    private String name;

    abstract void display(int index);

}
