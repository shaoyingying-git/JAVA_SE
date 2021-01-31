package com.itheima._05ArrayList;

import java.util.Scanner;

public class Demo01_对象数组 {
    public static void main(String[] args) {
        int[] arr = new int[2];

        int j = 10;

        arr[0] = j;

        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            System.out.println(a);
        }


        // 对象数组, 数组中存放Student对象
        Student[] stus = new Student[3];
        // 创建Student对象
        Student s1 = new Student("贾乃亮", 35);
        Student s2 = new Student("李小璐", 34);
        Student s3 = new Student("组织后卫", 28);

        stus[0] = s1;
        stus[1] = s2;
        stus[2] = s3;

        for (int i = 0; i < stus.length; i++) {
            // 获取单个元素的类型都是, Student类型
            Student s = stus[i];
            System.out.println(s);
        }



    }
}
