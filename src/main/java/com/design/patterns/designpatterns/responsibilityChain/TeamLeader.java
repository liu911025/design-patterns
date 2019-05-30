package com.design.patterns.designpatterns.responsibilityChain;

import java.util.Random;

/**
 * 组长
 */
public class TeamLeader extends Interviewer {

    public TeamLeader(String name) {
        super(name);
    }

    @Override
    void handleInterview(Interviewee interviewee) {
        System.out.println("组长面试" + interviewee.getName());
        boolean teamLeaderOpinion = new Random().nextBoolean();
        interviewee.setTeamLeaderOpinion(teamLeaderOpinion);
        if (interviewee.isTeamLeaderOpinion()) {
            System.out.println("[" + interviewee.getName() + "]同学组长面试通过");
            this.nextInterviewer.handleInterview(interviewee);
        }else {
            System.out.println("[" + interviewee.getName() + "]同学组长面试不通过");
        }
    }
}
