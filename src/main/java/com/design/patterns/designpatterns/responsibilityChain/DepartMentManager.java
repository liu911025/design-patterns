package com.design.patterns.designpatterns.responsibilityChain;


import java.util.Random;

/**
 * 部门经理
 */
public class DepartMentManager extends Interviewer {

    public DepartMentManager(String name) {
        super(name);
    }

    @Override
    void handleInterview(Interviewee interviewee) {
        System.out.println("部门经理面试" + interviewee.getName());
        if (interviewee.isTeamLeaderOpinion()) {
            interviewee.setDepartMentManagerOpinion(new Random().nextBoolean());
            if (interviewee.isDepartMentManagerOpinion()) {
                System.out.println("[" + interviewee.getName() + "]同学部门经理面试通过");
                this.nextInterviewer.handleInterview(interviewee);
            }else {
                System.out.println("[" + interviewee.getName() + "]同学部门经理面试不通过");
            }
        }

    }
}
