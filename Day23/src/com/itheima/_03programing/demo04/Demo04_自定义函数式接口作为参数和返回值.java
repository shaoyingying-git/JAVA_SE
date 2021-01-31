package com.itheima._03programing.demo04;
/*

    请自定义一个函数式接口MySupplier ，
    含有无参数的抽象方法get 得到Object 类型的返回值。
    并使用该函数式接口分别作为方法的参数和返回值。

 */
public class Demo04_自定义函数式接口作为参数和返回值 {
    public static void main(String[] args) {
        // 方法调用
        /*printData(new MySupplier() {
            @Override
            public Object get() {
                return "HelloWorld";
            }
        });*/

        // lambda
        printData(() -> "HelloWorld");

        printData(getData());

    }

    public static void printData(MySupplier lambda) {
        System.out.println(lambda.get());
    }

    // lambda作为方法的返回值,
    // 让函数式接口作为方法的返回值 >> 让匿名内部类作为方法的返回值 >> lambda作为方法的返回值
    public static MySupplier getData() {
        // 匿名内部类
        /*return new MySupplier() {
            @Override
            public Object get() {
                return "哈哈!~";
            }
        };*/

        // lambda
        return () -> "哇哈哈";
    }
}
