package com.design.patterns.designpatterns.command;

public class SuspendCommand extends Command {

    public SuspendCommand(Developer developer) {
        super(developer);
    }

    @Override
    public void execute(Requirement requirement) {
        developer.suspend(requirement);
    }
}
