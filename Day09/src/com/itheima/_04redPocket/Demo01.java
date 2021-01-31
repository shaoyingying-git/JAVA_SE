package com.itheima._04redPocket;

public class Demo01 {


   Student s2  = new Student("李四");
    static Student s1  = new Student("张三");

    public static void main(String[] args) {
        Demo01 d  = new Demo01();
    }
}

class Student{
    String name;
    static String country;

    public Student(String name) {
        System.out.println("我执行了"+name);
        this.name = name;
    }
    public static void show(){
        //System.out.println(name);
    }
}
