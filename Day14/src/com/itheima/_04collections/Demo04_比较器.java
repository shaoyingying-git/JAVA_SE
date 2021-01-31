package com.itheima._04collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*

    匿名内部类:
        前提: 存在一个类或者接口
        格式: new 类名/接口名 () {}
        本质: 表示继承了该类, 或者实现了该接口的子类对象

 */
public class Demo04_比较器 {
    public static void main(String[] args) {
        // demo01();

        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "b", "c", "a", "aa", "ab");

        // 降序排序
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);

        demo01();

    }

    private static void demo01() {
        ArrayList<Integer> list = new ArrayList<>();

        // 添加元素
        Collections.addAll(list, 5,4,6,8,7,9,2,3,1);
        System.out.println("排序前: " + list);

        // 7 8 6 4 5
        // 排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });


        System.out.println("排序后: " + list);
    }
}
