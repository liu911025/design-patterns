package com.design.patterns.designpatterns.proxy.jdk;

import com.design.patterns.designpatterns.proxy.RealSubject;
import com.design.patterns.designpatterns.proxy.Subject;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理, 需要实现接口
 */
public class JDKProxyTest {

    public static void main(String[] args) {

        Subject subject = new RealSubject();

        Subject proxy = (Subject) Proxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),
                (proxy1, method, args1) -> {
                    System.out.println("执行前处理");
                    Object o = method.invoke(subject, args1);
                    System.out.println("执行后处理");
                    return o;
                });

        proxy.request();

    }

}
