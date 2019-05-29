package com.design.patterns.designpatterns.template;

/**
 * Adidas Boost 鞋制造
 */
public class AdidasBoostShoeInstall extends ShoeInstallTemplate {
    @Override
    void installSole() {
        System.out.println("白色鞋底");
    }

    @Override
    void installInsole() {
        System.out.println("黑色鞋垫");
    }

    @Override
    void installVamp() {
        System.out.println("黑色鞋面");
    }

    @Override
    void installShoelace() {
        System.out.println("黑色鞋带");
    }
}
