package com.design.patterns.designpatterns.flyweight;

import java.util.concurrent.ConcurrentHashMap;

public class CrayonFactory {

    private static ConcurrentHashMap<String, ICrayon> crayonMap = new ConcurrentHashMap<>();

    private CrayonFactory() {}

    public static ICrayon getCrayon(String color) {
        if (crayonMap.containsKey(color)) {
            return crayonMap.get(color);
        }
        ICrayon crayon = new Crayon(color);
        crayonMap.put(color, crayon);
        return crayon;
    }

}
