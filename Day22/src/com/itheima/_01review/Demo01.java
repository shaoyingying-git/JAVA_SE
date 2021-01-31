package com.itheima._01review;

import java.io.*;

/*

    缓冲流
        字节流
            BufferedInputStream(InputStream)
            BufferedOutputStream(OutputStream)
        字符流
            BufferedReader(Reader)  -> readLine()
            BufferedWriter(Writer)  -> newLine()

        OutputStream(String, true): 追加, 而不是清空

        close() : 关流, 在关流之前, 刷出了一次缓冲区
        flush() : 刷出缓冲区

        什么时候用什么流:
            任何的拷贝都是用字节流;
            仅读取纯文本, 仅写出纯文本使用字符流.

    转换流
        InputStreamReader(InputStream, String charsetName)
            通过指定的字符集, 将字节转换成字符

        OutputStreamWriter(OutputStream, String  charsetName)
            通过指定的字符集, 将字符转换成字节

    序列化流
        序列化, 对象输出流: 将对象, 写出到文件上
            ObjectOutputStream(OutputStream)
            序列化的对象, 必须实现Serializable接口
        反序列化, 对象输入流: 将文件中的对象, 读取到内存中
            ObjectInputStream(InputStream)

    打印流:
        PrintStream, System.out

 */
public class Demo01 {
    public static void main(String[] args) throws IOException {
        // InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\gbk.txt"), "gbk");

        BufferedReader br =
                new BufferedReader(new InputStreamReader(new FileInputStream("d:\\gbk.txt"), "gbk"));

        BufferedWriter bw =
                new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Day11\\utf-8.txt"), "utf-8"));
    }
}
