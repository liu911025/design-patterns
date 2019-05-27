package com.design.patterns.designpatterns.proxy;

public class ProxyTest {

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();

        String pdf = "PDF";
        System.out.println(pdf.equalsIgnoreCase("pdf"));

    }
}
