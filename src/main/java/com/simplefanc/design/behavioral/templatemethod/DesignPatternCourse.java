package com.simplefanc.design.behavioral.templatemethod;

public class DesignPatternCourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("提供课程Java源代码");
    }

    @Override
    protected Boolean needWriteArticle() {
        return true;
    }
}
