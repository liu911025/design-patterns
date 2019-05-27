package com.design.patterns.designpatterns.adapter;

public class AdapterTest {

    public static void main(String[] args) {

        // 类适配器
        ClassAdapter classAdapter = new ClassAdapter();
        classAdapter.request();

        //对象适配器
        ObjectAdapter objectAdapter = new ObjectAdapter(new Adaptee());
        objectAdapter.request();

    }

}
