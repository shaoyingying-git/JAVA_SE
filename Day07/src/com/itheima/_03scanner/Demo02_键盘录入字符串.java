package com.itheima._03scanner;

import java.util.Scanner;

public class Demo02_键盘录入字符串 {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        System.out.println(i);

        Scanner sc2 = new Scanner(System.in);
        // 获取键盘录入的字符串
        String line = sc2.nextLine();
        System.out.println(line);
    }
}
