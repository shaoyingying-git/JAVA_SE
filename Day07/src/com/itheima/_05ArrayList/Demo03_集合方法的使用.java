package com.itheima._05ArrayList;

import java.util.ArrayList;

/*
    add: 添加功能
    remove: 删除功能
    get: 获取功能

 */
public class Demo03_集合方法的使用 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<String> list = new ArrayList<>();
        // 添加元素
        list.add("李小璐");// 0
        list.add("白百何");// 1
        list.add("王鸥"); //  2
        list.add("吴秀波"); // 3

        // 删除指定索引位置的元素
        String s = list.remove(2);
        //System.out.println(s);

        // 获取指定索引位置的元素
        //String e = list.get(2);
        //System.out.println(e);

        // 获取集合的长度

        // arr.length: 数组的长度属性
        // list.size(): 集合的长度方法, 会返回集合的长度

        // 查看方法的简单说明(参数和返回值类型) : 按住ctrl鼠标悬浮在方法上
        // 查看方法的详细说明(方法的声明, 源代码) : 按住ctrl鼠标点击
        int length = list.size();
        System.out.println("集合的长度为: " + length);

        // 集合可以直接打印, 打印出来的是集合中的元素
        // 集合也有索引, 从第一个元素开始, 从0开始编号
        System.out.println(list);


    }
}
