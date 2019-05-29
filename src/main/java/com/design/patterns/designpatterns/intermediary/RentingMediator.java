package com.design.patterns.designpatterns.intermediary;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 租房中介
 */
public class RentingMediator extends Mediator {

    private Map<String, Landlord> map;

    public RentingMediator() {
        map = new HashMap<>();
        map.put("XiaoQuFang", new XiaoQuFangLandlord());
        map.put("NongMinFang", new NongMinFangLandlord());
    }

    @Override
    void supplyHouse(List<String> types) {
        if (types.contains("XiaoQuFang")) {
            Landlord xiaoQuFang = map.get("XiaoQuFang");
            xiaoQuFang.supply();
        }
        if (types.contains("NongMinFang")) {
            Landlord nongMinFang = map.get("NongMinFang");
            nongMinFang.supply();
        }
    }
}
