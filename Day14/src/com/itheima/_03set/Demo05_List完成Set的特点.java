package com.itheima._03set;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Demo05_List完成Set的特点 {
    public static void main(String[] args) {
        // 唯一
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(2);
        list.add(1);
        list.add(1);
        ArrayList<Integer> single = getSingle(list);

        System.out.println(single);
    }

    public static ArrayList<Integer> getSingle(ArrayList<Integer> list) {
        // 创建LinkedHashSet集合.
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // 将list集合中所有元素添加到set集合中
        set.addAll(list);
        // 清空list集合
        list.clear();
        // 将set集合中所有元素添加到list集合中
        list.addAll(set);
        return list;
    }

}
