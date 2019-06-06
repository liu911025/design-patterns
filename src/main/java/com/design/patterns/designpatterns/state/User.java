package com.design.patterns.designpatterns.state;

public class User {

    private State state;


    public void register() {
        this.state.register();
    }

    public void apply() {
        this.state.apply();
    }

    public void draw(double money) {
        this.state.draw(money);
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
