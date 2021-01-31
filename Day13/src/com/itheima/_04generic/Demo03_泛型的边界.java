package com.itheima._04generic;

import java.util.ArrayList;
import java.util.Collection;

public class Demo03_泛型的边界 {
    public static void main(String[] args) {
        // Object > Number > Integer
        // Object > String
        Collection<String> stringCollection = new ArrayList<>();
        Collection<Integer> integerCollection = new ArrayList<>();
        Collection<Object> objectCollection = new ArrayList<>();
        Collection<Number> numberCollection = new ArrayList<>();

//         fun1(stringCollection); // 报错
        fun1(integerCollection);
        // fun1(objectCollection); // 报错
        fun1(numberCollection);

        // fun2(stringCollection);  // 报错
        // fun2(integerCollection); // 报错
        fun2(objectCollection);
        fun2(numberCollection);
    }

    // ?: 通配符
    // ? extends E : 固定泛型的上边界, 泛型可以是E, 也可以是E的子类
    // ? super E: 固定泛型的下边界, 泛型可以是E, 也可以是E的父类
    public static void fun1(Collection<? extends Number> c) {

    }

    public static void fun2(Collection<? super Number> c) {

    }
}
