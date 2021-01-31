package com.itheima._02extend.demo01;

public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog();

        Dog d2 = new Dog("金毛", "金毛");

        /*d.setKind("哈士奇");
        d.setColor("黑白");*/

        System.out.println("狗的品种是: " + d2.getKind());
        System.out.println("狗的颜色是: " + d2.getColor());

        d2.eat();
        d2.sleep();

        d.eat();
        d.sleep();
    }
}
