package com.simplefanc.design.structural.bridge;

/**
 * 活期账户
 */
public class SavingAccount implements Account {

    @Override
    public Account openAccount() {
        System.out.println("打开活期账户");
        return new SavingAccount();
    }

    @Override
    public void showAccountType() {
        System.out.println("这是一个活期账户类型");
    }
}
