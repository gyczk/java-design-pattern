package com.simplefanc.design.creational.abstractFactory;

public class JavaFactory extends CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
