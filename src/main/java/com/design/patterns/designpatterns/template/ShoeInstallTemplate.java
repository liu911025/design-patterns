package com.design.patterns.designpatterns.template;

/**
 * 鞋子安装模板
 */
public abstract class ShoeInstallTemplate {

    abstract void installSole();
    abstract void installInsole();
    abstract void installVamp();
    abstract void installShoelace();

    /**
     * 组装方法
     */
    public void installShot(){
        System.out.println("组装一双鞋，步骤如下：");
        // 组装鞋底
        installSole();
        // 组装鞋垫
        installInsole();
        // 组装鞋面
        installVamp();
        // 组装鞋带
        installShoelace();
    }

}
