package com.simplefanc.design.principle.singleResponsibility;

public class CourseImpl implements ICourse {
    @Override
    public String getCourseName() {
        return "课程名称";
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[123];
    }


    @Override
    public void studyCourse() {
        System.out.println("学习课程");
    }

    @Override
    public void refundCourse() {
        System.out.println("管理课程");
    }

    //添加课程积分功能 ICourseIntegral
    @Override
    public void exchangeIntegral() {
        System.out.println("换取课程积分");
    }
}
