package com.design.patterns.designpatterns.responsibilityChain;

public class ResponsibilityChainTest {

    public static void main(String[] args) {
        Interviewee interviewee = new Interviewee("小明");

        TeamLeader teamLeader = new TeamLeader("老刚");

        DepartMentManager departMentManager = new DepartMentManager("老孙");

        HR hr = new HR("老刘");
        // 设置面试流程
        teamLeader.setNextInterviewer(departMentManager);

        departMentManager.setNextInterviewer(hr);

        // 开始面试
        teamLeader.handleInterview(interviewee);

    }
}
