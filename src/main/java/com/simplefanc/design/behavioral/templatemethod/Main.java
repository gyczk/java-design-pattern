package com.simplefanc.design.behavioral.templatemethod;

/**
 * 模板方法模式测试
 */
public class Main {

    public static void main(String[] args) {
        DesignPatternCourse designPatternCourse = new DesignPatternCourse();
        designPatternCourse.makeCourse();
        System.out.println("--------------------");
        FECourse feCourse = new FECourse(true);
        feCourse.makeCourse();
    }
}
