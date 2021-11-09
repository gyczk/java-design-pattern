package com.simplefanc.design.principle.demeter;

public class Boss {

    public void commandCheckNumber() {
        new TeamLeader().checkNumberOfCourses();
    }
}
