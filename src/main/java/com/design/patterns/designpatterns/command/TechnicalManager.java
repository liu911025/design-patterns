package com.design.patterns.designpatterns.command;

public class TechnicalManager {

    private String name;

    private Command command;

    public TechnicalManager(String name, Command command) {
        this.name = name;
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(Requirement requirement) {
        command.execute(requirement);
    }
}
