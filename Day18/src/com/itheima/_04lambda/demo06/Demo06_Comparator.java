package com.itheima._04lambda.demo06;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo06_Comparator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 添加元素
        Collections.addAll(list, 3,4,2,1,5);

        // 降序排序
        /*Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        // lambda简化
        Collections.sort(list, (Integer o1, Integer o2) -> {
            return o2 - o1;
        });

        // 省略
        Collections.sort(list, (o1, o2) -> o2 - o1);


        System.out.println(list);
    }
}
