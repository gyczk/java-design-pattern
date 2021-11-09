package com.simplefanc.design.creational.builder;

/**

 * 课程经理
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String name, String PPT, String video, String article, String QA) {
        courseBuilder.buildName(name);
        courseBuilder.buildPPT(PPT);
        courseBuilder.buildVideo(video);
        courseBuilder.buildArticle(article);
        courseBuilder.buildQA(QA);
        return courseBuilder.makeCourse();
    }
}
