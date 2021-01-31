package com.itheima._03custom;

import java.util.Scanner;

public class Demo01_用户注册 {
    // 创建数组, 用来模拟数据库
    private static String[] users = {"kobe", "mcgrady", "carter", "iverson"};

    public static void main(String[] args)  {

        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要注册的用户名: ");
        String name = sc.nextLine();

        // 判断用户名是否存在
        if (isExists(name)) {
            // System.out.println("抛出异常, 用户名已存在");
            throw new RegisterException("用户名已存在!~");
        }else {
            System.out.println("注册成功");
        }



    }


    /**
     * 此方法用来检测用户名是否存在
     *
     * @param name 比较的姓名
     * @return true:存在   false:不存在
     */
    public static boolean isExists(String name) {
        for (String user : users) {
            // 判断是否相同
            if (user.equals(null)) {
                return true;
            }
        }
        // 循环结束后, 都没有相同的情况, 才说明不存在
        return false;
    }


}
