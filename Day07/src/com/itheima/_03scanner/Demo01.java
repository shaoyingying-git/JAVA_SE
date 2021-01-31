package com.itheima._03scanner;


import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        // 创建了一个键盘录入对象, 扫描控制台中键盘录入的内容
        Scanner sc = new Scanner(System.in);// alt + enter
        // 使用对象
        int i = sc.nextInt();
        System.out.println(i);
    }
}
