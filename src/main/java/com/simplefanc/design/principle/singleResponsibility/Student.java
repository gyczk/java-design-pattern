package com.simplefanc.design.principle.singleResponsibility;

public class Student {


    public Student(ICourse iCourse) {
        System.out.println(iCourse.getCourseVideo());
        System.out.println(iCourse.getCourseName());
        iCourse.studyCourse();
        iCourse.refundCourse();
        iCourse.exchangeIntegral();
    }
}
