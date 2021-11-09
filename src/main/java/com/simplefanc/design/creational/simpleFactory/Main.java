package com.simplefanc.design.creational.simpleFactory;

/**
 * 测试
 */
public class Main {

    public static void main(String[] args) {
//        Video video = new JavaVideo();
//        video.product();

        VideoFactory videoFactory = new VideoFactory();
//        Video video = videoFactory.getVideo("java");
//        video.product();

        Video video02 = videoFactory.getVideo02(PythonVideo.class);
        video02.product();

    }
}
