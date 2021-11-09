package com.simplefanc.design.creational.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**

 */
public class Main {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {

        /*Thread thread = new Thread(new T());
        Thread thread1 = new Thread(new T());
        thread.start();
        thread1.start();
        System.err.println("program end");*/

        //测试懒汉式抵御反射攻击（调用顺序不一样则结果不一样）

        //LazyDoubleCheckSingleton.getInstance(); 在反射之前调用的时候是可以抵御反射攻击的，如果在其后面则无法抵御反射攻击
        //原因：懒汉式是在用到的时候才创建实例，如果通过反射创建实例在前 则不会将创建的实例赋值成员变量，所以正常调用的时候还会再创建实例

        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

        Field flag = LazyDoubleCheckSingleton.class.getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(instance, true);

        Constructor constructor = LazyDoubleCheckSingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) constructor.newInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(newInstance == instance);
    }
}
