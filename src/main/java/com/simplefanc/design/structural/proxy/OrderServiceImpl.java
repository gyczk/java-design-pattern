package com.simplefanc.design.structural.proxy;

import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements IOrderService {
    private IOrderDao iOrderDao = new OrderDaoImpl();

    @Override
    public int saveOrder(Order order) {
        System.out.println("Service层调用Dao层添加Order！");
        return iOrderDao.insert(order);
    }

    @Override
    public int delete(Order order) {
        System.out.println("delete order object!");
        return 1;
    }
}
