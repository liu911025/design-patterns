package com.design.patterns.designpatterns.flyweight;

import lombok.Data;

/**
 * 蓝色蜡笔
 */
@Data
public class Crayon implements ICrayon {

    private String color;

    public Crayon(String color) {
        this.color = color;
        System.out.println("---新建【" + this.color + "】蜡笔");
    }

    @Override
    public void draw(String place) {
        System.out.println("使用" + this.getColor() + "颜色蜡笔画" + place);
    }
}
