package com.itheima._02interface.demo01;

public class InterTest {
    public static void main(String[] args) {
        // 创建接口的对象
//         MyInter mi = new MyInter(); // 报错, 接口不能创建对象

        // 创建接口实现类的对象
        MyClass mc = new MyClass();

        // 默认方法可以直接调用
        mc.defaultMethod();

        // 静态方法可以直接使用接口名去调用
        MyInter.staticMethod();
    }
}
