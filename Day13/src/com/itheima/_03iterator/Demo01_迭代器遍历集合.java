package com.itheima._03iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo01_迭代器遍历集合 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("贾巴尔");
        c.add("马龙");
        c.add("詹姆斯");
        c.add("乔丹");

        // 1. 获取集合对应的迭代器对象
        Iterator<String> it = c.iterator();
        // 使用循环获取集合中的元素
        // 2. 判断集合时候有下一个元素
        while (it.hasNext()) {
            // 3. 获取下一个元素
            String s = it.next();
            System.out.println(s);
        }
    }
}
