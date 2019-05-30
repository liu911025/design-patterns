package com.design.patterns.designpatterns.responsibilityChain;

import lombok.Data;

/**
 * 面试者
 */
@Data
public class Interviewee {

    private String name;

    private boolean teamLeaderOpinion;

    private boolean departMentManagerOpinion;

    private boolean hrOpinion;

    public Interviewee(String name) {
        this.name = name;
    }
}
