package com.simplefanc.design.structural.bridge;

/**
 * 桥接模式的本质：就是一个父类里面包含着另一个父类
 */
public class Main {
    public static void main(String[] args) {

        Bank icbcBank = new ICBCBank(new DepositAccount());
        Account account = icbcBank.openAccount();
        account.showAccountType();

        Bank abcBank = new ABCBank(new SavingAccount());
        Account account1 = abcBank.openAccount();
        account1.showAccountType();


    }
}
