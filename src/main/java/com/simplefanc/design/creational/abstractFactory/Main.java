package com.simplefanc.design.creational.abstractFactory;

public class Main {

    public static void main(String[] args) {
        CourseFactory pythonFactory = new PythonFactory();
        pythonFactory.getArticle().product();
        pythonFactory.getVideo().product();

        CourseFactory javaFactory = new JavaFactory();
        javaFactory.getArticle().product();
        javaFactory.getVideo().product();
    }
}
