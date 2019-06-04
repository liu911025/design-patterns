package com.design.patterns.designpatterns.observable;

/**
 * 被观察者
 */
public interface Observable {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyMessage(String message);
}
