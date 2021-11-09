package com.simplefanc.design.structural.facade;

/**
 * 外观模式测试
 */
public class Main {


    public static void main(String[] args) {
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(new PointsGift("mac pro "));
    }
}
