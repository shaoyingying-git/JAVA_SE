package com.itheima._01review;

import java.util.ArrayList;
import java.util.Collections;

public class Demo03 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "张三丰","张无忌","殷素素","张翠山","张飞","张十六侠");
        // 名字长度为3
        // 姓张
        // 跳过第一个
        // 只要第一个

        list.stream().filter(s -> s.length() == 3).filter(s -> s.startsWith("张")).skip(1).limit(1).forEach(s -> System.out.println(s));


    }
}
