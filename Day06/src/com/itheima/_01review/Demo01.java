package com.itheima._01review;
/*

    数组的复习
        数组的定义
            数组: 是一个容器, 可以存放同一种数据类型的多个元素, 长度是固定的

            数组的三种定义方式:

                数据类型[] 数组名 = new 数据类型[长度];
                int[] arr = new int[4];

                数据类型[] 数组名 = new 数据类型[] {元素1, 元素2 ...};
                int[] arr = new int[] {1, 2, 3};

                数据类型[] 数组名 = {元素1, 元素2 ...};
                int[] arr = {1, 2, 3};

        数组的使用
            数组有索引: 从数组的第一个元素开始, 从0开始编号;
            使用格式:  数组名[索引]

            arr[0] = 100; // 将100赋值给arr数组中0索引位置
            int i = arr[0]; // 将arr数组中0索引位置的值, 赋值给i
            System.out.println(arr[0]);// 作为参数传递


            public static void fun(int i) { }

            调用上面的方法:
                fun(arr[0]);

            数组的长度:  数组名.length
            最后一个元素的索引: 长度 - 1

            数组第一个元素: arr[0]
            数组最后一个元素: arr[arr.length - 1]


        数组的操作
            遇到的异常:
                ArrayIndexOutOfBoundsException: 数组索引越界异常
                    产生的原因: 访问了不存在的索引
                NullPointerException: 空指针异常
                    产生的原因: 使用了null数组, null调用了方法
            数组的遍历:
                获取数组中的每一个元素

            数组求最值


 */
public class Demo01 {
    public static void main(String[] args) {
        // String是字符串("字符串")
        String[] arr = {"java", "c++", "python", "php"};

        // 让for循环中i的值, 和数组的索引一一对应
        for (int i = 0; i < arr.length; i++) {
            // 将for循环中的i当做数组每一个元素的索引
            String s = arr[i];
            System.out.println(s);
        }

    }

    private static void demo1() {
        // ctrl + alt + m : 把选中的代码抽取成一个方法.
        int[] arr = null;
        System.out.println(arr[0]); // 出现了空指针异常
    }


}
