package com.itheima._01object;

import java.util.ArrayList;

/*
    查看一个类的继承体系

    ctrl + n : 查看指定的类
    ctrl + F12 : 查看类中的方法
 */
public class Demo01 {
    public static void main(String[] args) {
        // 创建Person对象
        Person p1 = new Person("张三", 23);
        Person p2 = new Person("张三", 24);

        System.out.println(p1.equals(p2));
        System.out.println(p1);
        System.out.println(p1.toString());

        System.out.println(p2);
        System.out.println(p2.toString());


        // System.out.println(p1.toString());
        // 没重写: com.itheima._01object.Person@13b6d03
        // 重写后: Person{name='张三', age=23}

        int[] arr = new int[3];
        System.out.println(arr.toString());
        System.out.println(arr);



        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);




    }
}
