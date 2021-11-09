package com.simplefanc.design.structural.facade;

/**
 * 积分支付子系统
 */
public class PointsPaymentService {

    public Boolean pay(PointsGift gift) {
        //扣减积分
        System.out.println("积分支付" + gift.getName() + "成功!");
        return true;
    }
}
