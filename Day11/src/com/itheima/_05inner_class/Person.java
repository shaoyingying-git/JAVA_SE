package com.itheima._05inner_class;

import java.sql.SQLOutput;

public class Person {   // 外部类
    int a = 10;

    public void fun() {
        Heart h = new Heart();
        System.out.println(h.innerA);
    }

    public class Heart {    // 成员内部类

        int innerA = 100;

        public void method() {
            System.out.println(a);
        }

    }

}
