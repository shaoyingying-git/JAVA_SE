package com.itheima.method;

public class Demo04_不定次数的打印 {
    public static void main(String[] args) {
        print(5);
    }
    /*
        实现, 给定次数(不确定), 打印该次数的"HelloWorld"

        明确返回值类型: void
        明确参数列表:  打印的次数, int

     */
    public static void print(int count) {
        // 方法调用的时候, 一定会指定count的值, 所以循环的次数是确定的(count次)
        // 创建一个可以循环count次的for循环
        for (int i = 1; i <= count; i++) {
            System.out.println("HelloWorld");
        }
    }
}
