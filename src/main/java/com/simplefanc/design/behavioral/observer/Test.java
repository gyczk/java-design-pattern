package com.simplefanc.design.behavioral.observer;

public class Test {
    public static void main(String[] args) {
        Course course = new Course("JAVA设计模式");
        Teacher teacher1 = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");

        course.addObserver(teacher1);
        course.addObserver(teacher2);

        Question question = new Question("Chenfan", "java的主函数怎么写");
        course.produceQuestion(question);
    }
}
