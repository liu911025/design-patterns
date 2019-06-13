package com.design.patterns.designpatterns.memento;

import lombok.Data;

/**
 * 部署者
 */
@Data
public class Deployer {

    private App app;

    /**
     * 创建备份
     * @return
     */
    public AppBackup createAppBackup() {
        return new AppBackup(this.app);
    }


    /**
     * 恢复应用
     * @param backup
     */
    public void recoverApp(AppBackup backup) {
        this.app = backup.getApp();
    }

    /**
     * 显示应用信息
     */
    public void showApp(){
        System.out.println(this.app.toString());
    }

    /**
     * 暂停应用
     */
    public void stopApp() {
        System.out.println("暂停应用：" + this.app.toString());
    }

    /**
     * 启动应用
     */
    public void startApp() {
        System.out.println("启动应用：" + this.app.toString());
    }
}
