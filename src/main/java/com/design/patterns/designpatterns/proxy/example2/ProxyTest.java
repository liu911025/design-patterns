package com.design.patterns.designpatterns.proxy.example2;

/**
 * 代理模式(静态代理) 测试
 */
public class ProxyTest {

    public static void main(String[] args) {
        WorldNetwork worldNetwork = new WorldNetwork();
        ChinnessNetwork chinnessNetwork = new ChinnessNetwork(worldNetwork);
        chinnessNetwork.access("www.google.com");
        chinnessNetwork.access("www.baidu.com");
    }

}
