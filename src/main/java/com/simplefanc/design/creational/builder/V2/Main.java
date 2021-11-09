package com.simplefanc.design.creational.builder.V2;

/**

 */
public class Main {
    public static void main(String[] args) {

        Course build = new Course.CourseBuilder()
                .buildName("java Course")
                .buildArticle("java article")
                .buildPPT("Java PPT")
                .buildVideo("Java video")
                .buildQA("java question and answer")
                .build();
        System.err.println(build);
    }
}
