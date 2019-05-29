package com.design.patterns.designpatterns.intermediary;

import java.util.Arrays;

/**
 * 测试
 */
public class MediatorTest {

    public static void main(String[] args) {
        Tenant tenant = new Tenant("小米", Arrays.asList("XiaoQuFang", "NongMinFang"));
        tenant.lookHouse();
    }

}
