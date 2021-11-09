package com.simplefanc.design.principle.dependenceInversion;

/**
 * 高层依赖接口层 不面向实现层
 */
public class Student {

//    private ICourse iCourse;

    public void studentStudyCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
}
