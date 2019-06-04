package com.design.patterns.designpatterns.iterator;

/**
 * 迭代器模式
 */
public interface IList {

    IIterator iterator();

    void add(Object obj);

    Object get(int index);

    int size();
}
