package com.itheima._01review;

public class Mouse implements Usb {
    @Override
    public void start() {
        System.out.println("鼠标插上了, 可以使用鼠标.");
    }

    @Override
    public void stop() {
        System.out.println("鼠标拔下来了, 停止使用了!");
    }


    /**
     * 鼠标点击功能
     */
    public void click() {
        System.out.println("鼠标点击功能");
    }
}
