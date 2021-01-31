package com.itheima._01review;

public class Student extends Person {
    public Student() {
        super();
    }

    public Student(String name, int age) {
        // 访问父类的构造方法
        super(name, age);
    }


}
