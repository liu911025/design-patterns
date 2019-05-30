package com.design.patterns.designpatterns.command;

public class DevelopCommand extends Command {

    public DevelopCommand(Developer developer) {
        super(developer);
    }

    @Override
    public void execute(Requirement requirement) {
        developer.develop(requirement);
    }
}
