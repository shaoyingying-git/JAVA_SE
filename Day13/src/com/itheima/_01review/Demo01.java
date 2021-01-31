package com.itheima._01review;
/*
    Object: 是每一个类的父类, 任何一个类都直接或者间接的继承自Object
        toString(): 用来返回地址值, 没有意义, 所以我们会重写toString()方法,
                    重写之后, 打印属性值.

        equals(): 用来比较地址值, 没有意义, 所以我们会重写equals()方法,
                    重写之后, 用来比较的属性值

    Date
        Date(): 当前时间
        Date(long): 从1970/01/01 08:00:00 加上传入的毫秒值

        getTime(): 获取当前Date对象, 表示的时间毫秒值

    SimpleDateFormat
        构造方法中, 指定模式
        SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        年: year
        月: month
        日: day
        时: hour
        分: minute
        秒: second

        格式化(Date -> String)
            String format(Date)
        解析(String -> Date)
            Date parse(String)

    Calendar
        创建对象
            Calendar rightNow = Calendar.getInstance(); // 当前时间

        get(int 字段): 获取指定字段对应的值

        set(字段, 值): 修改指定字段的值

        set(年, 月, 日, 时, 分, 秒)

        add(字段, 加上的值)


    System
        public static long currentTimeMillis() :
            获取当前时间的毫秒值
        public static void exit(int status) :
            退出Java虚拟机
        public static void arrayCopy(
                                    src: 源数组
                                    srcPos: 从原数组的哪个索引开始拷贝
                                    dest: 目的数组
                                    destPos: 从目的数组的哪个索引考试拷贝
                                    length: 拷贝的长度
                                      ):
            数组的拷贝


    StringBuilder: 字符串缓冲区

        StringBuilder(): ""
        StringBuilder(String): 和参数相同的字符序列

        append(Object)
        toString()

    包装类
        自动装箱: 将基本数据类型转换成包装类
        自动拆箱: 将包装类转换成基本数据类型

        parseXxx() : 将指定格式的字符串, 转换成基本数据类型
        "100" -> 100(int)
        Integer.parseInt("100")  -> 100(int)



 */
public class Demo01 {
    public static void main(String[] args) {
        /*Person p = new Person("张三丰", 100);

        String s = "abc";

        System.out.println(s + p);

        StringBuilder sb = new StringBuilder();
        sb.append(p);
        System.out.println(sb);*/


        Integer i1 = 100;
        Integer i2 = new Integer(100);

        System.out.println(i1 == i2);

        Integer i3 = new Integer(200);
        Integer i4 = new Integer(200);
        System.out.println(i3 == i4);

        Integer i5 = new Integer(100);
        Integer i6 = new Integer(100);
        System.out.println(i5 == i6);

        Integer i7 = 128;
        Integer i8 = 128;
        System.out.println(i7 == i8);

        Integer i9 = 127;
        Integer i10 = 127;
        System.out.println(i9 == i10);
        // Integer 里面有一块缓冲区(数组), -128~127已经存在缓冲区中
        // 自动装箱时, 如果数据在缓冲区里面, 就直接从缓冲区中获取
        // 如果数据不再缓冲区中, 就new出来

    }
}
