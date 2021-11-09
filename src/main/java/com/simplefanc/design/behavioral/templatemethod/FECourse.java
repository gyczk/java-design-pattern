package com.simplefanc.design.behavioral.templatemethod;

/**
 * 前端课程
 */
public class FECourse extends ACourse {
    private Boolean needWriteArticle = false;

    /**
     * 通过构造方法对外暴露钩子方法
     * @param needWriteArticle
     */
    public FECourse(Boolean needWriteArticle) {
        this.needWriteArticle = needWriteArticle;
    }

    @Override
    void packageCourse() {
        System.out.println("提供课程的图片等多媒体素材");
    }

    /**
     * 在子类中定义钩子方法
     * @return
     */
    @Override
    protected Boolean needWriteArticle() {
        return needWriteArticle;
    }
}
