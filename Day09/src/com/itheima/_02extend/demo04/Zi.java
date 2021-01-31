package com.itheima._02extend.demo04;

public class Zi extends Fu{
    int num = 100;

    public void fun() {
        int num = 10;

        // this: 代表本类对象, 谁来调用我, 我就代表谁
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);

    }


}
