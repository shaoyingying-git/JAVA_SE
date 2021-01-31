package com.itheima._04Random;

import java.util.Random;

public class Demo01 {
    public static void main(String[] args) {
        Random r = new Random();

        for (int i = 0; i < 10; i++) {
            int j = r.nextInt(10) + 1;
            System.out.println(j);
        }


    }
}
