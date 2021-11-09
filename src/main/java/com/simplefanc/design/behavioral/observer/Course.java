package com.simplefanc.design.behavioral.observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Observable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course extends Observable {
    private String courseName;

    public void produceQuestion(Question question) {
        System.out.println(question.getUserName() + "在" + courseName + "提交了一个问题");
        setChanged();
        notifyObservers(question);
    }
}
