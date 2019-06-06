package com.design.patterns.designpatterns.state;

/**
 * 状态模式
 *
 * 状态接口
 */
public interface State {

    void register();

    void apply();

    void draw(double money);

}
