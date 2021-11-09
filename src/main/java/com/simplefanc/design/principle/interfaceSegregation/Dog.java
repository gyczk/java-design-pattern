package com.simplefanc.design.principle.interfaceSegregation;


/**
 * 接口隔离原则
 */
public class Dog implements IEatInterface, ISwimInterface {
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void swim() {
        System.out.println("游泳");
    }

}
