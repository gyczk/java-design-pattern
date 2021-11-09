package com.simplefanc.design.behavioral.strategy;

import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
//        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());
//        promotionActivity618.excutePromotionStrategy();
//        promotionActivity1111.excutePromotionStrategy();

        /*PromotionActivity promotionActivity = null;
        String promotionKey = "LIJIAN";
        if(StringUtils.equals(promotionKey, "LIJIAN")){
            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
        } else if(StringUtils.equals(promotionKey, "FANXIAN")){
            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
        }//...
        promotionActivity.excutePromotionStrategy();*/

        String promotionKey = "LIJIAN";
        PromotionActivity promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.excutePromotionStrategy();
    }
}
