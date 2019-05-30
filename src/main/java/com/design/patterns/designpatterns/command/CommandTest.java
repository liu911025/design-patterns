package com.design.patterns.designpatterns.command;

/**
 * 命令模式测试
 */
public class CommandTest {

    public static void main(String[] args) {
        Requirement developRequirement = new Requirement("登录功能");
        Developer developer = new Developer("小米");
        Command developCommand = new DevelopCommand(developer);
        TechnicalManager technicalManager = new TechnicalManager("黑米", developCommand);
        technicalManager.action(developRequirement);

        Command suspendCommand = new SuspendCommand(developer);
        technicalManager.setCommand(suspendCommand);
        technicalManager.action(developRequirement);
    }

}
