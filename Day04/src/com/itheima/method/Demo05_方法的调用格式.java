package com.itheima.method;

/*
    没有返回值的方法
        直接调用 √
        赋值调用 ×
        输出语句调用 ×

    有明确返回值的方法
        直接调用 √, 但是没有意义
        赋值调用 √ , 建议使用
        输出语句调用 √ , 建议在只需要使用一次的时候使用


 */
public class
Demo05_方法的调用格式 {
    public static void main(String[] args) {
        // 直接调用
        noReturnFun(); // 可以调用
        haveReturnFun(); // 可以调用, 但是没有意义

        // 赋值调用
        // void v= noReturnFun(); // 报错
        int i = haveReturnFun();  //可以调用, 建议使用
        System.out.println(i);

        // 输出语句调用
        // System.out.println(noReturnFun()); // 报错
        System.out.println(haveReturnFun()); // 可以调用
    }

    // 有返回的方法
    public static int haveReturnFun() {
        return 100;
    }


    // 无返回的方法
    public static void noReturnFun() {
        System.out.println("无返回的方法");
    }

}
