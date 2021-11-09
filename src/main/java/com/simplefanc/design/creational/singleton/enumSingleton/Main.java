package com.simplefanc.design.creational.singleton.enumSingleton;


import java.io.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.testPrint();

        //测试枚举单例是否破坏序列化和反序列化
//        EnumSingleton instance = EnumSingleton.getInstance();
//        instance.setData(new Object());
//        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singleton_file"));
//        oos.writeObject(instance);
//
//        File file = new File("singleton_file");
//        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
//        EnumSingleton newInstance = (EnumSingleton) ois.readObject();
//
//        System.err.println(instance.getData());
//        System.err.println(newInstance.getData());
//        System.out.println(instance.getData() == newInstance.getData());

        //测试枚举单例反射攻击
//        EnumSingleton instance = EnumSingleton.getInstance();
//        Constructor constructor = EnumSingleton.class.getDeclaredConstructor(String.class, int.class);
//        constructor.setAccessible(true);//对私有构造器开放权限
//        EnumSingleton newInstance = (EnumSingleton) constructor.newInstance("cf", 666);//Cannot reflectively create enum objects
    }
}
