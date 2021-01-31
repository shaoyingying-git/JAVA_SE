package com.itheima._05_19;
/*
    debug/ 断点调试的步骤

    1. 打断点, 在一行的前面, 行号的后面, 单击
    2. 以debug方式运行程序
    3. 一步一步的执行代码
        step over(F8) 可以一步一步的执行代码
        step into(F7) 进入方法中
    4. 取消断点
 */
public class Demo02_debug {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            fun();
            sum += i;
        }

        System.out.println(sum);


    }


    public static void fun() {
        System.out.println("1111");
        System.out.println("2222");
    }
}
