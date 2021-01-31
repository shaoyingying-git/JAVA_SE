package com.itheima._02collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo04_集合存放自定义类型 {
    public static void main(String[] args) {
        Student s1 = new Student("赵薇", 42);
        Student s2 = new Student("黄晓明", 45);
        Student s3 = new Student("陈坤", 40);
        Student s4 = new Student("黄渤", 50);

        Collection<Student> c = new ArrayList<>();
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);

        // 打印集合中的元素
        // System.out.println(c);

        // 遍历并打印
        /*for (int i = 0; i < c.size(); i++) {
            c.get(i);
        }*/

    }
}
