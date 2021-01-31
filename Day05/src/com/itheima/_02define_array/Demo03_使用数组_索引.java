package com.itheima._02define_array;
// 使用索引的格式
// 数组名[索引] : 获取指定索引位置的元素
//  使用方式: 1. 改变这个元素的值
//          2. 用这个值赋值给其他变量
//          3. 将这个值打印, 作为参数传递
public class Demo03_使用数组_索引 {
    public static void main(String[] args) {
        // 创建数组
        int[] arr = new int[3];
        // 将10 赋值给arr数组中索引为0的那个元素
        arr[0] = 10;

        // 将arr数组中索引为0的元素的值, 赋值给i
        int i = arr[0];
        System.out.println(i);

        // 将arr数组中索引为0的元素进行打印
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

    }
}
