package com.itheima._04static;

public class Person {
    private static String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 用来打印类中的属性值
     */
    public void show() {
        System.out.println("姓名是: " + name + ", 年龄是: " + age);
    }
}
