package com.simplefanc.design.structural.adapter.objectAdapter;


/**
 * 对象适配器
 */
public class Adapter implements Target {
    private final Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
