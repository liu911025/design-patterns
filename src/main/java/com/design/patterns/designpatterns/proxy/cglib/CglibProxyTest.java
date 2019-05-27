package com.design.patterns.designpatterns.proxy.cglib;


import com.design.patterns.designpatterns.proxy.cglib.Singer;

public class CglibProxyTest {

    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Singer());

        Singer proxy = (Singer) proxyFactory.getProxyInstance();

        proxy.sing();

    }

}
