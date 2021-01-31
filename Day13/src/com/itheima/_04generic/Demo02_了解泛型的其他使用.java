package com.itheima._04generic;

public class Demo02_了解泛型的其他使用 {
    public static void main(String[] args) {
        MyGenericClass<String> mgc = new MyGenericClass<>();

        mgc.genericMethod(100);

        MyClass<String> mc = new MyClass<>();
        mc.fun("abc");

    }
}
