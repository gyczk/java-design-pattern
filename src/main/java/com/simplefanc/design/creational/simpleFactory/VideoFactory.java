package com.simplefanc.design.creational.simpleFactory;

/**
 * 视频工厂
 */
public class VideoFactory {


    /**
     * 该方法的局限性：违反了开闭和原则，添加其他视频类型需要修改简单工厂 添加对应的类型
     */
    public Video getVideo(String type) {
        if (type.equalsIgnoreCase("java")) {
            return new JavaVideo();

        } else if (type.equalsIgnoreCase("python")) {
            return new PythonVideo();
        }
        return null;
    }

    /**
     * 利用反射可以解决上述问题
     */
    public Video getVideo02(Class videoClass) {
        Video video = null;
        try {
            video = (Video) Class.forName(videoClass.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;

    }
}
