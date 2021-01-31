package com.itheima._03programing.demo01;

public class Demo01_延迟执行 {
    public static void main(String[] args) {
        String msgA = "Hello";
        String msgB = "World";
        String msgC = "Java";

        printMessage1(2, msgA + msgB + msgC);
        // printMessage2(2, msgA, msgB, msgC);
        printMessage3(2, () -> msgA + msgB + msgC);

        /*printMessage3(1, new Logable() {
            @Override
            public String printLog() {
                return msgA + msgB + msgC;
            }
        });*/
    }

    public static void printMessage1(int level, String message) {
        // 判断, 如果等级为1, 才打印
        if (1 == level) {
            // 打印日志信息
            System.out.println(message);
        }
    }

    // 可变参数: 可以传入任意个该类型的参数
    public static void printMessage2(int level, String ... arr) {
        if (1 == level) {
            String s = "";
            // 遍历数组
            for (String str : arr) {
                s = s + str;
            }
            System.out.println("完成了拼接操作");
            System.out.println(s);
        }
    }

    // 使用lambda表达式解决
    public static void printMessage3(int level, Logable lambda) {
        if (1 == level) {
            System.out.println(lambda.printLog());
        }
    }
}
