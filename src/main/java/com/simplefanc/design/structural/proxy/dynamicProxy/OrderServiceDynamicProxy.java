package com.simplefanc.design.structural.proxy.dynamicProxy;

import com.simplefanc.design.structural.proxy.Order;
import com.simplefanc.design.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class OrderServiceDynamicProxy implements InvocationHandler {
    /**
     * 目标对象
     */
    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    /**
     * 返回代理类
     * @return
     */
    public Object bind() {
        Class<?> cls = target.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), this);
    }

    /**
     * @param proxy  代理类
     * @param method 要被增强的方法
     * @param args   被增强的方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = args[0];
        beforeMethod(object);
        //result 被增强的方法的返回值
        Object result = method.invoke(target, args);
        afterMethod(object);
        return result;
    }

    private void beforeMethod(Object object) {
        System.out.println("动态代理 before code");

        if (object instanceof Order) {
            Order order = (Order) object;
            int dbRouter = order.getUserId() % 2;
            System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

            //todo 设置dataSource
            DataSourceContextHolder.setDBType("db" + dbRouter);
        }
    }

    private void afterMethod(Object object) {
        System.out.println("动态代理 after code");
    }
}
