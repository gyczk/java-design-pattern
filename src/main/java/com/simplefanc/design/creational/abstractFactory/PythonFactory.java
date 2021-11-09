package com.simplefanc.design.creational.abstractFactory;

public class PythonFactory extends CourseFactory {
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
