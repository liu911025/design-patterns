package com.design.patterns.designpatterns.proxy.example2;

public class WorldNetwork implements Internet {
    @Override
    public String access(String domain) {
        System.out.println("访问网站：" + domain);
        return domain + "网站内容";
    }
}
