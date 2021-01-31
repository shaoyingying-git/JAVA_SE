package com.itheima._05landlords;

import java.util.ArrayList;
import java.util.Collections;

public class Demo01 {
    public static void main(String[] args) {

        // 买牌
        // 创建用来存放54张扑克牌的集合
        ArrayList<String> list = new ArrayList<>();

        // 创建点数数组
        String[] numbers = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        // 创建花色数组
        String[] colors = {"♥", "♠", "♣", "♦"};

        // 外层循环遍历花色
        for (String color : colors) {
            // 内循环遍历点数
            for (String number : numbers) {
                // 拼接得到了扑克牌
                String poker = color + number;
                // 将牌添加到集合中
                list.add(poker);
            }
        }

        // 添加大小王
        list.add("♙");
        list.add("♛");

        // 洗牌
        Collections.shuffle(list);


        // 发牌
        // 创建四个容器, 分别代表三个人和底牌
        ArrayList<String> me = new ArrayList<>();
        ArrayList<String> gaoOO = new ArrayList<>();
        ArrayList<String> ziXia = new ArrayList<>();

        ArrayList<String> left = new ArrayList<>();

        // 遍历集合, 这里需要索引, 所以不能使用增强for, 需要使用普通for
        for (int i = 0; i < list.size(); i++) {
            // i大于等于size() - 3  发给底牌
            if (i >= list.size() - 3) {
                left.add(list.get(i));
            }else if (i % 3 == 0) { // 看% 3的值
                me.add(list.get(i));
            }else if (i % 3 == 1) {
                gaoOO.add(list.get(i));
            }else{
                ziXia.add(list.get(i));
            }
        }

        // 看牌
        System.out.println("底牌: " + left);
        System.out.println("我: " + me);
        System.out.println("圆圆: " + gaoOO);
        System.out.println("紫霞: " + ziXia);

    }
}
