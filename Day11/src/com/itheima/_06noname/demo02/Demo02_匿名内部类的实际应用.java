package com.itheima._06noname.demo02;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Demo02_匿名内部类的实际应用 {
    public static void main(String[] args) {
        // 计时器
        Timer t = new Timer();
        // 计划
        // 需要传入TimerTask类的子类对象
        // new 类名() {} -> 继承了该类的子类对象
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("到点了, 起床背单词了!~");
            }
        }, new Date(2020, 9, 16, 19, 05, 00));
    }
}
