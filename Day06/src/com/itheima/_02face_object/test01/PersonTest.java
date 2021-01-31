package com.itheima._02face_object.test01;

/**
 * 测试类
 *  用来测试Person类中的代码
 *
 *  有主方法
 */
public class PersonTest {
    public static void main(String[] args) {
        // 创建对象: 类名 对象名 = new 类名()
        Person p = new Person();
        // 使用属性: 对象名.属性名
        p.name = "高圆圆";
        p.age = 40;
        System.out.println(p.name);
        System.out.println(p.age);

        // 使用行为: 对象名.方法名()
        p.eat();
        p.sleep();


        Person p2 = new Person();

        p2.name = "贾静雯";
        p2.age = 45;

        p2.eat();
    }
}
