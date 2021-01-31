package com.itheima._02list;

import java.util.LinkedList;

public class Demo03_LinkedList {
    public static void main(String[] args) {

        // demo01();

        LinkedList<Integer> list = new LinkedList<>();

        list.push(1);
        list.push(2);

        list.pop();

        System.out.println(list);

        demo01();


    }

    private static void demo01() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(50);

        list.addFirst(10);

        list.addLast(100);


        // list.removeFirst();

        // list.removeLast();

        System.out.println(list.getFirst());
        System.out.println(list.getLast());

        System.out.println(list);
    }
}
