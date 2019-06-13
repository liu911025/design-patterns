package com.design.patterns.designpatterns.memento;

/**
 * 备忘录模式测试
 */
public class MementoTest {

    public static void main(String[] args) {
        Deployer deployer = new Deployer();
        deployer.setApp(new App("apply-system", "1.0.0"));

        System.out.println("1. 暂停旧应用");
        deployer.stopApp();

        System.out.println("2. 备份旧应用");
        Space space = new Space();
        space.setAppBackup(deployer.createAppBackup());

        System.out.println("3. 拷贝新应用到服务器");
        deployer.setApp(new App("apply-system", "2.0.0"));
        deployer.showApp();

        System.out.println("4. 启动新应用");
        deployer.startApp();

        System.out.println("5. 有异常，暂停新应用");
        deployer.stopApp();

        System.out.println("6. 回滚旧应用，拷贝备份的旧应用到服务器");
        deployer.recoverApp(space.getAppBackup());
        deployer.showApp();

        System.out.println("7. 启动备份的旧应用");
        deployer.startApp();
    }

}