package com.itheima._04change;

import java.io.*;
/*

228
189
160
229
165
189


196
227
186
195


 */
public class Demo02_转换流的使用 {
    public static void main(String[] args) throws IOException {

        // 转换流的输入流, 通过指定的字符集, 将字节转换成字符
        InputStreamReader isr = new InputStreamReader(new FileInputStream("d:\\gbk.txt"), "gbk");
        // 转换流的输出流, 通过指定的字符集, 将字符转换成字节
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("Day10\\utf-8.txt"), "utf-8");

        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }

        isr.close();
        osw.close();


    }
}
