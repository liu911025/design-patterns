package com.design.patterns.designpatterns.observable;

import java.util.ArrayList;
import java.util.List;

public class User implements Observer, Observable {

    private List<Observer> friends;
    private String name;

    public User(String name) {
        this.name = name;
        this.friends = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        friends.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        friends.remove(observer);
    }

    @Override
    public void notifyMessage(String message) {
        friends.forEach(friend -> friend.update(this.name, message));
    }

    @Override
    public void update(String name, String message) {
        System.out.println("【" + this.name + "】看到【" + name + "】发的朋友圈：" + message);
    }

    public void sendMessage(String message) {
        this.notifyMessage(message);
    }
}
