package com.design.patterns.designpatterns.singleton;

/**
 * 懒汉式单例模式
 */
public class LazySingleton {

    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {}

    public static synchronized LazySingleton getInstance() {
        if (null == lazySingleton) {
            return new LazySingleton();
        }
        System.out.println("LazySingleton created ");
        return lazySingleton;
    }
}
