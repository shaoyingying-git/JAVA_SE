package com.itheima.method;

public class Demo02_判断相等 {
    public static void main(String[] args) {
        boolean b = isEquals(20, 20);
        // 打印
        System.out.println(b);
    }

    /**
     * 此方法用来判断两个数是否相等
     *
     * 明确返回值类型: 是否相等  boolean
     * 明确参数列表: 两个数, int a, int b
     */
    public static boolean isEquals(int a, int b) {
        if (a == b) {
            return true;
        }else {
            return false;
        }
    }

}
