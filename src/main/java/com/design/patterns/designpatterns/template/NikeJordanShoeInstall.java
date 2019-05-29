package com.design.patterns.designpatterns.template;

/**
 * Nike Jordan 鞋制造
 */
class NikeJordanShoeInstall extends ShoeInstallTemplate {

    @Override
    public void installSole() {
        System.out.println("组装黑色 Jordan 鞋底");
    }

    @Override
    public void installInsole() {
        System.out.println("组装黑色 Jordan 鞋垫");
    }

    @Override
    public void installVamp() {
        System.out.println("组装红色 Jordan 鞋面");
    }

    @Override
    public void installShoelace() {
        System.out.println("组装红色 Jordan 鞋带");
    }
}
