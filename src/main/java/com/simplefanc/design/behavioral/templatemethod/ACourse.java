package com.simplefanc.design.behavioral.templatemethod;

public abstract class ACourse {

    /**
     * 声明为final 不可被重写
     */

    protected final void makeCourse() {
        makePPT();
        makeVideo();
        if (needWriteArticle()) {
            writeArticle();
        }
        packageCourse();
    }

    final void makePPT() {
        System.out.println("制作PPT");
    }

    final void makeVideo() {
        System.out.println("制作视频");
    }

    final void writeArticle() {
        System.out.println("编写手记");
    }

    /**
     * 钩子方法可以留给子类实现
     *
     * @return
     */
    protected Boolean needWriteArticle() {
        return false;
    }

    /**
     * 完全留给子类去实现
     */
    abstract void packageCourse();
}

