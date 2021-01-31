package com.itheima._01review;

import java.util.*;

/*
    List
        特点: 有序, 有索引, 可以重复

        功能:
            增加:
                add(index, e)
            删除
                remove(index)
            修改
                set(index, e)
            查询
                get(index)


        ArrayList   底层是数组
        LinkedList  底层是链表
            addFirst()  removeFirst()   getFirst()
            addLast()   removeLast()    getLast()
        Vector

    Set
        特点: 无序, 无索引, 不可以重复(保证元素唯一)
        HashSet: 通过hashCode(), equals() 保证元素的唯一

        TreeSet: 通过底层二叉树

        LinkedHashSet: 保证元素唯一, 保证怎么存就怎么取

    数据结构
        栈:先进后出
        队列: 先进先出
        数组: 查询快, 增删慢
        链表: 查询慢, 增删快

    Collections
        可变参数:
            (数据类型 ... 变量名) : 可以传入该类型任意个参数

        addAll(集合, 可变参数)

        shuffle()

        sort()

        sort(集合, 比较器)
 */
public class Demo01 {
    public static void main(String[] args) {
//        demo01();

        // demo02();

        ArrayList<Person> list = new ArrayList<>();

        list.add(new Person("赵六", 26));
        list.add(new Person("李四2", 24));
        list.add(new Person("李四1", 24));
        list.add(new Person("张三", 23));
        list.add(new Person("王五", 25));

        Collections.sort(list, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                // 先按照年龄排序, 如果年龄相同, 再按照姓名排序
                int num = o1.getAge() - o2.getAge();
                return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
            }
        });

        for (Person person : list) {
            System.out.println(person);
        }
    }

    private static void demo02() {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list, 3, 2, 4, 5, 1, 8, 7, 6, 9);

        // 按照自然排序
        // Collections.sort(list);

        // 按照比较器排序
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);
    }

    private static void demo01() {
        Vector<Integer> v = new Vector<>();
        v.add(1);
        v.add(3);
        v.add(2);

        // System.out.println(v);

        Enumeration<Integer> elements = v.elements();

        while (elements.hasMoreElements()) {
            Integer i = elements.nextElement();
            System.out.println(i);
        }
    }
}
