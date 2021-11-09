package com.simplefanc.design.structural.decorator.v2;


public class Test {
    public static void main(String[] args) {
        AbstractBatterCake aBatterCake;
        aBatterCake = new BatterCake();
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new EggDecorator(aBatterCake);
        aBatterCake = new SausageDecorator(aBatterCake);

        System.out.println(aBatterCake.getDesc() + " 销售价格：" + aBatterCake.cost());
    }
}
