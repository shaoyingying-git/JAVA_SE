package com.itheima._01review;

import java.io.*;
import java.net.URL;

public class Demo02 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://download.skycn.com/hao123-soft-online-bcs/soft/2017_09_11_winrar-x64-550scp.exe");
        InputStream is = url.openStream();

        BufferedInputStream bis = new BufferedInputStream(is);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("Day12\\download.exe"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bos.close();
        bis.close();

    }
}
