package com.simplefanc.design.behavioral.strategy;

/**
 * 空策略
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
