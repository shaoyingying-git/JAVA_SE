package com.itheima._01review;

public class KeyBoard implements Usb {
    @Override
    public void start() {
        System.out.println("键盘插上了, 可以使用键盘.");
    }

    @Override
    public void stop() {
        System.out.println("键盘拔下来了, " +
                "停止使用了!");
    }

    /**
     * 键盘敲击功能
     */
    public void type() {
        System.out.println("键盘敲击功能");
    }
}
