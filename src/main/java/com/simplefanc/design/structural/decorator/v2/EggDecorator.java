package com.simplefanc.design.structural.decorator.v2;

/**
 * 具体的装饰角色 负责给煎饼拓展功能
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(AbstractBatterCake batterCake) {
        super(batterCake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + " 加一个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
