package com.simplefanc.design.structural.facade;

/**
 * 物流子系统
 */
public class ShippingService {

    public String shipGift(PointsGift gift) {
        //物流子系统的对接逻辑
        System.out.println(gift.getName() + "进入物流");
        long shipNo = System.currentTimeMillis();
        //物流订单号
        return String.valueOf(shipNo);
    }
}
