package com.itheima._01review;
/*
    继承
        把几个事物共性的内容抽取出来, 放到父类中.
        让其他的子类, 继承父类.

        格式:
            public class Zi extends Fu {}

        特点:
            子类可以继承父类所有非私有的属性和行为
            构造方法不继承

        注意:
            java中只支持单继承, 不支持多继承,但是支持多层继承


        重载(overload): 同一个类中, 方法名相同, 参数列表不同, 与返回值类型和修饰符无关
        重写(override): 子父类中, 出现了一模一样的方法(子类的权限可以 >= 父类)


        继承情况下, 使用子类对象调用成员的特点:
            子类有, 就用子类;子类没有找父类, 父类有就用父类; 父类没有就报错.

        this: 代表本类对象, 谁来调用我, 我就代表谁
        super: 代表父类引用,


    抽象
        public abstract class 类 {}

        public abstract void fun();


        子类必须要重写父类所有的抽象方法

 */
public class Demo01 {
    public static void main(String[] args) {
        Student s = new Student("高圆圆", 40);

        s.setAge(50);

        System.out.println(s.getAge());

    }
}
