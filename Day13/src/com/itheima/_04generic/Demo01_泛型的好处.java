package com.itheima._04generic;


import java.util.ArrayList;

public class Demo01_泛型的好处 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 没有泛型, 集合可以添加任意类型
        list.add("abc");
        /*list.add(100);
        list.add(true);
        list.add('a');
        list.add(new Student("张三", 23));*/

        // 遍历集合
        for (String o : list) {
            System.out.println( o.length());
        }
    }
}
