package com.itheima._01review;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*

    Collection  单列集合的根接口
        |-- List    有序, 有索引, 可以重复
            |-- ArrayList     数组
            |-- LinkedList    链表
            |-- Vector

        |-- Set     无序, 无索引, 不可以重复
            |-- HashSet
                |-- LinkedHashSet
            |-- TreeSet

         add(元素)
         clear()
         remove(元素)
         contains(元素)
         isEmpty()
         size()
         Object[] toArray()
         T[] toArray(T[] )

    迭代器

        1. 获取集合对应的迭代器对象,  集合.iterator()
        2. 判断是否有下一个元素       it.hasNext()
        3. 获取下一个元素, 指针下移    it.next()

        增强for循环:  用来遍历容器
        for (容器中元素的数据类型 变量名 : 容器) {
        }

    泛型
        ArrayList<E>
        用来限定集合中元素的数据类型

    ConcurrentModificationException: 并发修改异常
        使用迭代器遍历集合的时候, 使用集合的方法修改(增删)了集合中的元素
        
    
    如何修改(增删)集合中的元素
    
        1. 使用普通for, 删除了元素之后, 将i自减
        2. 倒着使用普通for循环
        3. 可以使用迭代器自己的删除方法

        4. 如果想增加元素, 可以使用列表迭代器 listIterator

 */
public class Demo01 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Java");
        list.add("Python");
        list.add("C");
        list.add("PHP");

        // 如果集合中有Java就删掉它
        // 遍历集合
        /*for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ("Java".equals(s)) {
                list.remove("Java");
                // 删除了元素之后, i自减
                i--;
            }
        }

        System.out.println(list);*/

        // 使用迭代器遍历, 使用迭代器自己的删除方法
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            String s = it.next();
            if ("Java".equals(s)) {
                // list.remove(s);
                // it.remove(); // 指针指到谁就删除谁

                it.add("Aaa");
            }
        }

        System.out.println(list);


    }
}
