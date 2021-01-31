package com.itheima._02interface.demo04;

import java.util.Calendar;

public class AnimalTest {
    public static void main(String[] args) {

        Dog d = new Dog("大黄", 2);
        d.eat();
        d.sleep();

        d.lookDoor();

        Cat c = new Cat("小花", 3);
        c.eat();
        c.sleep();

        c.catchMouse();



        if (c instanceof LookDoorAble) {
            System.out.println("是会看门的动物");
        }else {
            System.out.println("不是会看门的动物");
        }





    }
}
