package com.simplefanc.design.structural.proxy.staticProxy;

import com.simplefanc.design.structural.proxy.IOrderService;
import com.simplefanc.design.structural.proxy.Order;
import com.simplefanc.design.structural.proxy.OrderServiceImpl;
import com.simplefanc.design.structural.proxy.db.DataSourceContextHolder;

/**
 * 订单服务静态代理 ，对原服务进行增强
 */
public class OrderServiceStaticProxy {
    private IOrderService iOrderService = new OrderServiceImpl();

    public int saveOrder(Order order) {
        beforeMethod(order);

        int result = iOrderService.saveOrder(order);

        afterMethod();

        return result;
    }

    /**
     * 在保存数据之前 选择数据库 对原方法进行增强
     */
    private void beforeMethod(Order order) {
        System.out.println("静态代理 before code");
        int dbRouter = order.getUserId() % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");

        //根据userId 的不同将数据分别插入到不同的库中 实现分库的功能
        //todo 设置dataSource
        DataSourceContextHolder.setDBType("db" + dbRouter);
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
