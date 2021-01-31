package com.itheima._01review;

import java.util.Arrays;
import java.util.Random;

/*

    有两条线程, 同时想数组中添加数据, 每条线程添加3个数据.

    数组长度: 6

 */
public class Demo02 {
    public static void main(String[] args) {
        new AddArray().start();
        new AddArray().start();
    }
}

class AddArray extends Thread {
    // 数组是共享数据
    private static int[] arr = new int[6];
    // 数组的索引是共享数据
    private static int index = 0;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (AddArray.class) {
                int nextInt = new Random().nextInt(100);
                // 向数组中添加数据
                arr[index] = nextInt;
                index++;

                System.out.println(getName() + "向数组中添加了数据: " + nextInt);
                System.out.println("添加后的数组为: " + Arrays.toString(arr));
            }
        }
    }
}