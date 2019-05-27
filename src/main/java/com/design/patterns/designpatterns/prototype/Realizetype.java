package com.design.patterns.designpatterns.prototype;

/**
 * Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，这里的 Cloneable 接口就是抽象原型类
 */
public class Realizetype implements Cloneable {
    public Realizetype() {
        System.out.println("具体原型创建成功！");
    }
    public Object clone() throws CloneNotSupportedException
    {
        System.out.println("具体原型复制成功！");
        return (Realizetype)super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype1 = new Realizetype();
        Realizetype clone = (Realizetype) realizetype1.clone();
        System.out.println(realizetype1 == clone);
    }
}
