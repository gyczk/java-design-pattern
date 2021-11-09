package com.simplefanc.design.creational.factoryMethod;


/**
 * 测试
 */
public class Main {

    public static void main(String[] args) {

        VideoFactory javaVideoFactory = new JavaVideoFactory();
        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        pythonVideoFactory.getVideo().product();
        Video video = javaVideoFactory.getVideo();
        video.product();
    }
}
