package com.simplefanc.design.structural.facade;

/**
 * 礼物兑换系统
 */
public class GiftExchangeService {

    /**
     * 集成spring后通过注入
     */
    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift gift) {
        if (qualifyService.isAvailable(gift)) {
            //资格校验通过
            if (pointsPaymentService.pay(gift)) {
                //积分兑换成功
                //返回订单号
                String orderNO = shippingService.shipGift(gift);
                System.out.println(gift.getName() + "的订单号：" + orderNO);
            }
        }
    }
}
