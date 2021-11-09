package com.simplefanc.design.creational.singleton.lazy;

/**

 * <p>
 * 懒汉单例
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //构造器私有化 防止外部new 对象
    private LazySingleton() {
    }

    //解决多线程下懒汉式单例出现的问题  可用synchronized修饰  但是synchronized修饰static方法 锁的是类Class文件(不是static方法 锁的是堆内存中生成的对象)
    //而且开锁加锁 比较消耗性能
    //所以 能解决问题 但是一般不用
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //等价于
//    public static LazySingleton getInstance() {
//        synchronized (LazySingleton.class){
//            if (lazySingleton == null) {
//                lazySingleton = new LazySingleton();
//            }
//        }
//        return lazySingleton;
//    }
}