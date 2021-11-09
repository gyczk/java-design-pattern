package com.simplefanc.design.creational.builder;

/**

 */
public class Main {

    public static void main(String[] args) {
        Coach coach = new Coach();
        //可以注入不同的builder
        coach.setCourseBuilder(new CourseActualBuilder());

        Course course = coach.makeCourse("java", "java PPT", "java Video", "java article", "QA");
        System.out.println(course);
    }

}