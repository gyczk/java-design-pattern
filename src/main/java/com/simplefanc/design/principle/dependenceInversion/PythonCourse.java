package com.simplefanc.design.principle.dependenceInversion;

public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Python 课程");
    }
}
