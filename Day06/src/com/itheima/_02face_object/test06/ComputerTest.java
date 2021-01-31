package com.itheima._02face_object.test06;

public class ComputerTest {
    public static void main(String[] args) {
        // 创建对象
        Computer c = new Computer("ThinkPad", "酷睿i5");
        // 调用方法
        System.out.println("品牌是: " + c.getBrand());
        System.out.println("cpu是: " + c.getCpu());

        c.setCpu("酷睿i7");
        System.out.println("修改后的cpu是: " + c.getCpu());

    }
}
