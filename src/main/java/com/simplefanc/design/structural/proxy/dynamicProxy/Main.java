package com.simplefanc.design.structural.proxy.dynamicProxy;

import com.simplefanc.design.structural.proxy.IOrderService;
import com.simplefanc.design.structural.proxy.Order;
import com.simplefanc.design.structural.proxy.OrderServiceImpl;

/**
 * 动态代理测试
 */
public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        order.setUserId(4);

        IOrderService dynamicProxy = (IOrderService)
                new OrderServiceDynamicProxy(
                        //增强OrderServiceImpl
                        new OrderServiceImpl()
                ).bind();
        dynamicProxy.saveOrder(order);
//        dynamicProxy.delete(order);
    }
}
