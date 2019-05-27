package com.design.patterns.designpatterns.factory.abstractFactory;

/**
 * 抽象工厂一个工厂对应多种产品
 */
public class FarmTest {

    public static void main(String[] args) {
        try {
            Farm f = (Farm) ReadXML.getObject();
            Animal a = f.newAnimal();
            Plant p = f.newPlant();
            a.show();
            p.show();
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
