package com.design.patterns.designpatterns.bridge.example2;

public class AndroidPhone extends Phone {

    public AndroidPhone (String system, SoftWare softWare) {
        this.setSystem(system);
        this.setSoftWare(softWare);
    }

    @Override
    void openSoftware() {
        this.getSoftWare().open(this);
    }
}
