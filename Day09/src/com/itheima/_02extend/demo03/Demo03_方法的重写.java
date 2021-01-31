package com.itheima._02extend.demo03;
/*

    子类觉得父类中的方法, 不够好

    子类就可以重写父类中的方法

    重写(复写, 覆盖): 子父类中, 出现了一模一样的方法.


    实际的定义: 子类方法的权限必须和父类相同或者比父类高

 */
public class Demo03_方法的重写 {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();
        d.sleep();
    }
}
