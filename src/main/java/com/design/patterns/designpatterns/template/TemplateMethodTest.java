package com.design.patterns.designpatterns.template;

public class TemplateMethodTest {

    public static void main(String[] args) {
        ShoeInstallTemplate adidasBoost = new AdidasBoostShoeInstall();
        adidasBoost.installShot();
        ShoeInstallTemplate nikeJordan = new NikeJordanShoeInstall();
        nikeJordan.installShot();
    }

}
