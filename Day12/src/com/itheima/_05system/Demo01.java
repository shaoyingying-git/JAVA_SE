package com.itheima._05system;

import java.util.Date;

public class Demo01 {
    public static void main(String[] args) {

        Date d = new Date();
        System.out.println(d.getTime());

        long start = System.currentTimeMillis();


        for (int i = 0; i < 1000000; i++) {
            new Object();
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        for (int i = 0; i < 100; i++) {
            if (i == 50) {
                System.exit(-2);
                // break;
            }
            System.out.println(i);
        }


        System.out.println("循环后的语句");

    }
}
