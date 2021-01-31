package com.itheima._01review;

import java.util.Arrays;
import java.util.Comparator;

/*
    等待唤醒机制
        wait()
        notify()

        1. 必须在同步中
        2. 必须使用锁对象来调用
        3. 处在Object类中
    线程池

    Lambda表达式

        前提:
            有接口, 接口中有且只有一个抽象方法
            接口作为方法的参数

        对匿名内部类简化形式

        ()  重写方法的参数列表
        ->  参数给大括号使用
        {}  重写方法的方法体


 */
public class Demo01 {
    public static void main(String[] args) {
        // Runnable
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("开启线程");
            }
        }).start();

        new Thread(() -> System.out.println("开启线程"));


        // Comparator
        Integer[] arr = {2, 3, 4, 1};
        /*Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });*/

        Arrays.sort(arr, (o1, o2) -> o2 - o1);

        System.out.println(Arrays.toString(arr));
    }
}
