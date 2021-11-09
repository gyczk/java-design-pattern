package com.simplefanc.design.creational.singleton.threadLocalSingleton;

/**
 * 线程"单例"模式  多线程的情况下 每个线程持有一个唯一的单例
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal
            = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton() {

    }

    public static ThreadLocalSingleton getInstance() {
        return threadLocalSingletonThreadLocal.get();
    }
}
