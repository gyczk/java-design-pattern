package com.simplefanc.design.creational.singleton.threadLocalSingleton;

public class T implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.err.println(instance);
    }
}
