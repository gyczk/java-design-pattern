package com.simplefanc.design.structural.proxy.staticProxy;

import com.simplefanc.design.structural.proxy.Order;

/**
 * 静态代理测试
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy staticProxy = new OrderServiceStaticProxy();
        staticProxy.saveOrder(order);
    }
}
