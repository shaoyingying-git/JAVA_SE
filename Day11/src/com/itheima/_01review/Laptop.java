package com.itheima._01review;

public class Laptop {

    public void open() {
        System.out.println("电脑开机了.");
    }


    public void shutdown() {
        System.out.println("电脑关机了!~");
    }


    /**
     * 使用USB设备的方法
     */
    public void useUsbDevice(Usb usb) { // Usb usb = new Mouse();
        // 插上
        usb.start();

        // instanceof :  A instanceOf B ->
            // 判断A是否是B类型

        // 判断, 是否是鼠标类型
        if (usb instanceof Mouse) {
            // 鼠标点击
            ((Mouse)usb).click();
        }else if (usb instanceof KeyBoard) {
            // 键盘敲击
            ((KeyBoard) usb).type();
        }


        // 拔下
        usb.stop();
    }

}
