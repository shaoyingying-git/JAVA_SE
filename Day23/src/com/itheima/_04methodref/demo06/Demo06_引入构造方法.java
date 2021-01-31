package com.itheima._04methodref.demo06;

import java.util.Arrays;

public class Demo06_引入构造方法 {
    public static void main(String[] args) {
        // 匿名内部类
        /*printArray(new Arraybuilder() {
            @Override
            public int[] buildArray(int len) {
                return new int[len];
            }
        });*/

        // lambda
        // printArray(len -> new int[len]);

        // 方法引用
        // 创建数组对象的功能已经定义好了
        // A :: B  :   数组中的  创建功能
        // printArray(int[]::new);


        // 匿名内部类
        /*printPerson(new PersonBuilder() {
            @Override
            public Person buildPerson(String name) {
                return new Person(name);
            }
        });*/

        // lambda
        printPerson(name -> new Person(name));

        // 方法引用
        // Person中的创建对象功能已经定义好了
        // A 中的 B功能    Person 中的  创建功能
        printPerson(Person::new);

    }

    public static void printArray(Arraybuilder lambda) {
        int[] arr = lambda.buildArray(3);
        arr[0] = 99;
        System.out.println(Arrays.toString(arr));
    }


    public static void printPerson(PersonBuilder lambda) {
        Person person = lambda.buildPerson("古力娜扎");
        System.out.println(person);
    }
}
