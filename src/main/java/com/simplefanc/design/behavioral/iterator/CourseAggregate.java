package com.simplefanc.design.behavioral.iterator;

/**
 * 课程集合
 */
public interface CourseAggregate {
    void addCourse(Course course);

    void removeCourse(Course course);

    CourseIterator getCourseIterator();
}
