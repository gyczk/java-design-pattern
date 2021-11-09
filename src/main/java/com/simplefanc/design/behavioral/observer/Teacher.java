package com.simplefanc.design.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;
import java.util.Observer;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Observer {
    private String teacherName;

    @Override
    public void update(Observable o, Object arg) {
        Course course = (Course) o;
        Question question = (Question) arg;
        System.out.println(teacherName + "老师的" + course.getCourseName() + "课程接收到一个" + question.getUserName() + "提交的问题：" + question.getContent());
    }
}
