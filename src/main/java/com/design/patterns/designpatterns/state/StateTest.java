package com.design.patterns.designpatterns.state;

public class StateTest {

    public static void main(String[] args) {
        User user = new User();
        user.setState(new RegisterState());
        user.apply();
        user.draw(1000);
        user.setState(new ApplyState());
        user.draw(2000);
    }
}
