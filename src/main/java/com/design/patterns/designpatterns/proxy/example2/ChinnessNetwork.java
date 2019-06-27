package com.design.patterns.designpatterns.proxy.example2;

import java.util.HashSet;
import java.util.Set;

public class ChinnessNetwork implements Internet {

    private Set<String> disable;

    private Internet internet;

    public ChinnessNetwork(Internet internet) {
        this.internet = internet;
        this.disable = new HashSet<>();
        this.disable.add("www.google.com");
        this.disable.add("www.facebook.com");
    }

    @Override
    public String access(String domain) {
        if (disable.contains(domain)) {
            System.out.println("禁止访问该网站：" + domain);
            return "禁止访问该网站：" + domain;
        }
        return internet.access(domain);
    }
}
