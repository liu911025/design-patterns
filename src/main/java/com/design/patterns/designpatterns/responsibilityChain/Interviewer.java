package com.design.patterns.designpatterns.responsibilityChain;

/**
 * 面试官
 */
public abstract class Interviewer {

    private String name;

    protected Interviewer nextInterviewer;

    public Interviewer(String name) {
        this.name = name;
    }

    public Interviewer setNextInterviewer(Interviewer interviewer) {
        this.nextInterviewer = interviewer;
        return this.nextInterviewer;
    }

    abstract void handleInterview (Interviewee interviewee);
}
