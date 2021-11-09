package com.simplefanc.design.structural.adapter.classAdapter;

/**
 * 类适配器
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
