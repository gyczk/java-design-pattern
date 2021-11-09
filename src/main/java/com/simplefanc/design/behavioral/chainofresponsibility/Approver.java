package com.simplefanc.design.behavioral.chainofresponsibility;

public abstract class Approver {
    /**
     * 声明一个自己类型的对象
     */
    protected Approver approver;

    public void setNextApprover(Approver nextApprover){
        this.approver = nextApprover;
    }

    public abstract void deploy(Course course);
}
