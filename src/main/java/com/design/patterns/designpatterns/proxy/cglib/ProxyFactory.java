package com.design.patterns.designpatterns.proxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Cglib动态代理,不需要实现接口
 */
public class ProxyFactory implements MethodInterceptor {

    private Object target;

    public ProxyFactory(Object tarage) {
        this.target = tarage;
    }

    // 给tarage创建代理对象
    public Object getProxyInstance() {
        // 工具类
        Enhancer en = new Enhancer();
        // 设置父类
        en.setSuperclass(target.getClass());
        // 设置回调
        en.setCallback(this);
        return en.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("向观众问好!");
        Object result = method.invoke(target, args);
        System.out.println("谢谢观众");
        return result;
    }
}
