package com.itheima._04static;
/*

    使用特点:
        静态只能访问静态

    类中:
        跟着类
            静态变量
            静态方法

        跟着对象走
            成员变量
            成员方法

      1. 静态的内容是随着类的加载而加载
      2. 静态的内容是优先于对象存在

 */
public class Demo02_使用特点 {

    public static void main(String[] args) {
        // fun();

        // 先创建对象
        Demo02_使用特点 d = new Demo02_使用特点();
        // 有对象就说明这个方法一定存在, 所以可以调用
        d.fun();

    }


    // 非静态的方法, 就是成员方法, 需要使用对象
    public void fun() {
        System.out.println("非静态的fun方法");
    }

}
