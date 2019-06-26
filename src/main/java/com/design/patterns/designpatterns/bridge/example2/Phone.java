package com.design.patterns.designpatterns.bridge.example2;

import lombok.Data;

@Data
public abstract class Phone {

    private String System;      // 系统

    private SoftWare softWare;   //安装的软件

    abstract void openSoftware();
}
