package com.itheima._06landlords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Demo01_斗地主 {
    public static void main(String[] args) {
        // 买牌
        // 创建Map集合, 键就是数字由小到大, 值就是牌, 牌也是由小到大(扑克规则)
        HashMap<Integer, String> map = new HashMap<>();
        // 创建list集合, 元素就是Map集合的键
        ArrayList<Integer> list = new ArrayList<>();

        // 创建花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        // 创建点数数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 1;

        // 外循环遍历点数
        for (String number : numbers) {
            // 内循环遍历花色
            for (String color : colors) {
                // 拼接
                String poker = color + number;
                // 向map集合中添加
                map.put(index, poker);
                // 向list集合中添加
                list.add(index++); // 添加完成后, 再自增
            }
        }

        // 添加大小王
        map.put(index, "♙");
        list.add(index++);

        map.put(index, "♛");
        list.add(index);

        // 洗牌
        Collections.shuffle(list);
        // System.out.println(list);

        // 发牌
        // 创建四个容器
        ArrayList<Integer> me = new ArrayList<>();
        ArrayList<Integer> fage = new ArrayList<>();
        ArrayList<Integer> zhazhahui = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();

        // 向四个容器中发牌
        for (int i = 0; i < list.size(); i++) {
            // 发牌添加元素的时候, 不要添加索引, 要添加索引对应的元素值
            // 如果是最后3张牌, 就发给底牌
            if (i >= list.size() - 3) {
                dipai.add(list.get(i));
            }else if (i % 3 == 0) {
                me.add(list.get(i));
            }else if (i % 3 == 1) {
                fage.add(list.get(i));
            }else {
                zhazhahui.add(list.get(i));
            }
        }

        // 排序
        sort(me);
        sort(fage);
        sort(zhazhahui);
        sort(dipai);

        // 看牌
        showPoker(map, dipai, "底牌");
        showPoker(map, me, "泽神");
        showPoker(map, fage, "发哥");
        showPoker(map, zhazhahui, "渣辉");

    }

    /**
     * 此方法用于降序排序
     */
    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

    }

    /**
     * 此方法用于看牌
     */
    public static void showPoker(HashMap<Integer, String> map, ArrayList<Integer> list, String name) {
        // 使用StringBuilder进行字符串的拼接
        StringBuilder sb = new StringBuilder(name);

        sb.append(" : ");

        for (Integer key : list) {
            String value = map.get(key);
            sb.append(value).append(" ");
        }

        System.out.println(sb);
    }
}
