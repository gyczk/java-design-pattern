package com.simplefanc.design.creational.singleton.hungry;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        //测试序列化和反序列化对单例的破坏
        //破坏的原因解析：
        //反序列化的时候通过反射newInstance 重新生成了一个类 所有和原有的类不是同一个
        //解决办法：
        //在单例类中重写一个方法：readResolve 返回单例类 底层代码在执行的过程中虽然还会通过反射重新创建单例，但是最终会调用这个方法，从而返回原始的单例
//        HungarySingleton instance = HungarySingleton.getInstance();
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        HungarySingleton newInstance = (HungarySingleton) ois.readObject();
//
//        System.err.println(instance);
//        System.err.println(newInstance);
//        System.out.println(instance == newInstance);


        //对于在类加载时创建单例对象 1.静态内部类单例 2.饿汉式单例 在私有构造器内部加判断即可抵御反射攻击
        HungarySingleton instance = HungarySingleton.getInstance();
        Constructor constructor = HungarySingleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);//对私有构造器开放权限
        HungarySingleton newInstance = (HungarySingleton) constructor.newInstance();
//
//        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
//        Constructor constructor = StaticInnerClassSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        StaticInnerClassSingleton newInstance = (StaticInnerClassSingleton) constructor.newInstance();


        //对于懒汉式是无法抵御反射攻击的
    }
}
