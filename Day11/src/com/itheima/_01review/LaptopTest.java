package com.itheima._01review;
/*

    ClassCastException :: 类型转换异常   键盘不能转换成鼠标

 */
public class LaptopTest {
    public static void main(String[] args) {
        // 创建笔记本电脑对象
        Laptop lt = new Laptop();

        // 电脑开机
        lt.open();
        // 创建鼠标对象
        Mouse mouse = new Mouse();
        // 使用鼠标
        lt.useUsbDevice(mouse);
        // 创建键盘对象
        KeyBoard kb = new KeyBoard();
        // 使用键盘
        lt.useUsbDevice(kb);

        // 电脑关机
        lt.shutdown();

    }
}
