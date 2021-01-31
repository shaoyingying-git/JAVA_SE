package com.itheima._03iterator;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03_增强for {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("贾巴尔");
        c.add("马龙");
        c.add("詹姆斯");
        c.add("乔丹");

        // for (容器中元素的数据类型 变量名 : 容器)
        for (String s : c) {
            System.out.println(s);
        }


        int[] arr = {1,2,3,4,5};

        for (int i : arr) {
            System.out.println(i);
        }


    }
}
