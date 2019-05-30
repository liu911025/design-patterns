package com.design.patterns.designpatterns.responsibilityChain;

import java.util.Random;

public class HR extends Interviewer {

    public HR(String name) {
        super(name);
    }

    @Override
    void handleInterview(Interviewee interviewee) {
        System.out.println("HR面试" + interviewee.getName());
        if (interviewee.isDepartMentManagerOpinion()) {
            interviewee.setHrOpinion(new Random().nextBoolean());
            if (interviewee.isHrOpinion()) {
                System.out.println("[" + interviewee.getName() + "]同学HR轮面试通过, 恭喜拿到 Offer");
            }else {
                System.out.println("[" + interviewee.getName() + "]同学HR轮面试不通过");
            }
        }
    }
}
