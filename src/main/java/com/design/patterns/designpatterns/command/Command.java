package com.design.patterns.designpatterns.command;

/**
 * 命令
 */
public abstract class Command {

    protected Developer developer;

    public Command(Developer developer) {
        this.developer = developer;
    }

    /** 执行 */
    abstract void execute(Requirement requirement);
}
