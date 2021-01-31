package com.itheima._01review;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

/*
    异常

        Throwable 所有异常和错误的超类
            |-- Error 错误 , 无法处理, 只能尽量避免
            |-- Exception 异常
                |-- 运行时异常, RuntimeException, 它的子类
                |-- 编译时异常, 除了RuntimeException, 必须处理


        异常的产生原因:
            throw new Exception()
        虚拟机处理异常的方式:
            将异常的类名, 信息, 出现的位置打印到控制台, 程序终止运行

    处理异常的两种方式

        throws

            如果出现了问题, 程序终止

        try-catch

            如果出现了问题, 程序会继续执行


       try-catch-finally

        try: 用来检测异常
        catch: 用来捕捉异常
        finally: 用于释放资源, finally中的代码一定会执行(除非遇到System.exit())

 */
public class Demo01 {
    public static void main(String[] args) {
        try {
           // FileInputStream fis = new FileInputStream("");

            new SimpleDateFormat("").parse("");

        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("释放资源");
        }



    }
}
