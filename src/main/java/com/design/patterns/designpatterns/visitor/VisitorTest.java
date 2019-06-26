package com.design.patterns.designpatterns.visitor;

public class VisitorTest {

    public static void main(String[] args) {
        AlibabaCompany alibabaCompany = new AlibabaCompany();
        TencentCompany tencentCompany = new TencentCompany();
        ProvincialLeaderVistor provincialLeaderVistor = new ProvincialLeaderVistor();
        NationalLeaderVistor nationalLeaderVistor = new NationalLeaderVistor();

        Hotel xilaideng = new Hotel();
        xilaideng.add(alibabaCompany);
        xilaideng.add(tencentCompany);

        xilaideng.entertain(provincialLeaderVistor);
        xilaideng.entertain(nationalLeaderVistor);
    }
}
