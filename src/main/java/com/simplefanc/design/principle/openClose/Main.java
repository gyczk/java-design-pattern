package com.simplefanc.design.principle.openClose;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(1, "java 课程", 233d);
        log.debug("课程打折价：{}", iCourse.getPrice());
        JavaDiscountCourse discountCourse = (JavaDiscountCourse) iCourse;
        log.debug("课程原价：{}", discountCourse.getOriginPrice());
    }
}
