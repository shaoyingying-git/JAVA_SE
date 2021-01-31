package com.itheima._02collection;

import java.util.ArrayList;
import java.util.Collection;

public class Demo02_Collection中的功能 {
    public static void main(String[] args) {
        // 创建集合
        Collection<String> coll = new ArrayList<>();
        // 明确使用的方法一定是Collection中
        //调用成员方法的特点: 编译看左边, 运行看右边
        // add: 添加
        coll.add("高圆圆");
        coll.add("贾静雯");
        coll.add("朱茵");
        coll.add("张敏");
        // coll.add(100);

        // coll.remove("朱茵");

        // 清空
//         coll.clear();

        // contains()

//         System.out.println(coll.contains("朱茵"));

        // System.out.println(coll.isEmpty()); // true: 集合里面没有内容

        System.out.println("集合的长度为: " + coll.size());

        System.out.println(coll);


        /*for (int i = 0; i < 10000000; i++) {
            new Object();
        }
        

        Collection<String> c2 = new ArrayList<>();
        c2 = null;
        System.out.println(c2.isEmpty());*/

    }
}
