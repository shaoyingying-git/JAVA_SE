package com.itheima.method;
/*

    重载: 在同一个类中, 出现了方法名相同, 参数列表不同, 与返回值类型和修饰符无关的多个方法

        参数列表不同:
            1. 个数不同
            2. 类型不同
            3. 顺序不同

    定义一个方法, 用来求两个整数的和
    定义一个方法, 用来求三个整数的和
    定义一个方法, 用来求两个小数的和

 */
public class Demo06_方法的重载 {
    public static void main(String[] args) {

        int sum = getSum(1, 2);
        double sum1 = getSum(1.2, 2.2);
        System.out.println(sum);
        System.out.println(sum1);
    }



    public static double getSum(double a, int b) {
        return a + b;
    }

    public static double getSum(int a, double b) {
        return a + b;
    }




    /*
        用来求两个整数的和
     */
    public static int getSum(int a, int b) {
        return a + b;
    }

    /*
        用来求三个整数的和
     */
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }

    public static double getSum(double a, double b) {
        return a + b;
    }


}
