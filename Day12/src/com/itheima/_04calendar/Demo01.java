package com.itheima._04calendar;

import java.util.Calendar;

public class Demo01 {
    public static void main(String[] args) {

        // 创建对象, 表示当前时间
        Calendar c = Calendar.getInstance();

        // 修改年
        // c.set(Calendar.YEAR, 2008);

        // c.set(2008, 7, 8);

        // add(int field, int n) : 对指定字段进行向后加, 向前减
        c.add(Calendar.YEAR, 10);


        // 获取年月日
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH);
        int day = c.get(Calendar.DAY_OF_MONTH);


        System.out.println("年: " + year);
        System.out.println("月: " + (month + 1));
        System.out.println("日: " + day);


    }
}
