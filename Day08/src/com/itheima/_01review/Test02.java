package com.itheima._01review;

import java.util.Random;
import java.util.Scanner;

/*
    游戏开始时，会随机生成一个1-100之间的整数number 。
    玩家猜测一个数字guessNumber ，会与number 作比较，
    系统提示大了或者小了，直到玩家猜中，游戏结束。



    获取一个1~100之间的随机数   number

    // 如果两个数不相等, 就继续猜 不可以
    while (true) {

        键盘录入一个整数  guessNumber

        if (guessNumber > number) {
            输出 大了
        }else if (guessNumber < number) {
            输出 小了
        }else {
            // 如果两个数相等了, 就不猜了
            猜中了
            // 结束循环
            break;
        }

    }


 */
public class Test02 {
    public static void main(String[] args) {
        Random r = new Random();
        // 获取1~100之间的随机数
        int number = r.nextInt(100) + 1;
        // 创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要猜测的数字, 如果想停止输入-1");
        while (true) {
            //键盘录入一个整数  guessNumber
            int guessNumber = sc.nextInt();

            // 结束的判断
            if (guessNumber == -1) {
                // break;
                return; // 结束方法
            }


            if (guessNumber > number) {
                System.out.println("大了");
            }else if (guessNumber < number) {
                System.out.println("小了");
            }else {
                System.out.println("猜中了!~");
                break;
            }

        }
    }
}
