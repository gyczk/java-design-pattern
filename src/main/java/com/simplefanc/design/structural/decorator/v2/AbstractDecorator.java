package com.simplefanc.design.structural.decorator.v2;

/**
 * 抽象的装饰角色
 */
public abstract class AbstractDecorator extends AbstractBatterCake {
    private AbstractBatterCake abstractBatterCake;

    public AbstractDecorator(AbstractBatterCake batterCake) {
        this.abstractBatterCake = batterCake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.abstractBatterCake.getDesc();
    }

    @Override
    protected int cost() {
        return this.abstractBatterCake.cost();
    }
}
