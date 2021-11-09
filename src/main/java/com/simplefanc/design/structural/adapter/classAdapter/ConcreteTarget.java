package com.simplefanc.design.structural.adapter.classAdapter;


public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concrete target");
    }
}
