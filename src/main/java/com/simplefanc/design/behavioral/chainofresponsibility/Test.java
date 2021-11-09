package com.simplefanc.design.behavioral.chainofresponsibility;

public class Test {
    public static void main(String[] args) {
        Approver aticleApprover = new AticleApprover();
        Approver videoApprover = new VideoApprover();
        Course course = new Course();
        course.setName("java设计模式");
        course.setAticle("手记");
        course.setVideo("视频");
        aticleApprover.setNextApprover(videoApprover);
        aticleApprover.deploy(course);
    }
}
