package com.itheima._03dateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01 {
    public static void main(String[] args) throws ParseException {

        // 创建对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // 创建代表当前时间的Date对象
        Date d = new Date();
        // 格式化
        String s = sdf.format(d);
        System.out.println(s);

        // 创建的字符串, 对应构造中的模式
        String s2 = "2008/08/08 20:00:00";
        // 解析
        Date oly = sdf.parse(s2);

        System.out.println(oly);

    }

}
