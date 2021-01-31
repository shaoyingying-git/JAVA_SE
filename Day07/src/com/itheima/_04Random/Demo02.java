package com.itheima._04Random;

import java.util.Random;

public class Demo02 {
    public static void main(String[] args) {
        Random r = new Random(10);

        for (int i = 0; i < 10; i++) {
            int j = r.nextInt(100) + 1;
            System.out.println(j);
        }
    }
}
