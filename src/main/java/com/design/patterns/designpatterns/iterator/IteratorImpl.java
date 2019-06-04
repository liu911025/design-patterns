package com.design.patterns.designpatterns.iterator;

/**
 * 迭代器实现
 */
public class IteratorImpl implements IIterator {

    private IList list;

    private int index;

    public IteratorImpl(IList list) {
        this.list = list;
        this.index = 0;
    }

    @Override
    public Object next() {
        return list.get(index++);
    }

    @Override
    public boolean hasNext() {
        if (index < list.size()) {
            return true;
        }
        return false;
    }
}
