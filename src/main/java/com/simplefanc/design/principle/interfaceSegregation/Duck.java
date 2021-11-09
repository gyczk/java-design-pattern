package com.simplefanc.design.principle.interfaceSegregation;

public class Duck implements IEatInterface, IFlyInterface, ISwimInterface {
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }

    @Override
    public void swim() {
        System.out.println("游");
    }
}
