package com.design.patterns.designpatterns.bridge.example2;

/**
 * 桥接模式测试
 */
public class BridgeTest {

    public static void main(String[] args) {
        AndroidPhone android = new AndroidPhone("Android", new FireFox());

        IOSPhone ios = new IOSPhone("IOS", new Chrome());

        android.openSoftware();
        ios.openSoftware();
    }

}
