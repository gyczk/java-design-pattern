package com.simplefanc.design.structural.facade;

/**
 * 资格校验
 */
public class QualifyService {

    public Boolean isAvailable(PointsGift gift) {
        System.out.println("校验" + gift.getName() + "积分资格通过");
        return true;
    }
}
