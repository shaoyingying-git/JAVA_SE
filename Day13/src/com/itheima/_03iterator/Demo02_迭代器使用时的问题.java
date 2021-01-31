package com.itheima._03iterator;

import com.itheima._02collection.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    NoSuchElementException: 没有这个元素异常

 */
public class Demo02_迭代器使用时的问题 {
    public static void main(String[] args) {
        // 解决 : 一个hasNext()方法就只对应一个next()

        Collection<Student> c = new ArrayList<>();

        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));
        c.add(new Student("赵六", 26));
        c.add(new Student("周琦", 27));

        // 获取集合对应的迭代器对象
        Iterator<Student> it = c.iterator();
        // 判断是否有下一个元素
        while (it.hasNext()) {
            Student student = it.next();

            // 获取下一个元素  next()
            System.out.println("姓名是: " + student.getName());
            System.out.println("年龄是: " + student.getAge());
            System.out.println("~~~~~~~~~~~~~~~");
        }
    }
}
