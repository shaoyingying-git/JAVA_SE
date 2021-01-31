package com.itheima._02map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/*
    增
        V put(K, V)
    删
        V remove(K k): 删除传入键所表示的键值对, 返回删除的值
    改
        V put(K, V) : 如果键相同, 那么值就会覆盖
    查
        V get(K k) : 根据键, 获取值
    其他
        size() : 获取Map集合中键值对的个数

        boolean containsKey(K key)  : 判断集合中是否包含指定的键
        boolean containsValue(V value) : 判断集合中是否包含指定的值

        Set<K> keySet(): 获取Map集合中所有的键, 存放到返回的Set集合中
        Collection<V> values() : 获取Map集合中所有的值, 存放到返回的Collection集合中

 */
public class Demo02_Map集合的功能 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("广坤", 35);
        map.put("赵四", 24);
        map.put("张三", 24);


        Set<String> keySet = map.keySet();

        System.out.println(keySet);

        Collection<Integer> values = map.values();

        System.out.println(values);

        System.out.println(map);


        // map.put("张三", 33);

        // System.out.println(map.remove("赵四"));

        // System.out.println(map.get("赵四"));

        // System.out.println(map.size());

        // System.out.println(map.containsKey("赵玉田"));

        // System.out.println(map.containsValue(25));

        // System.out.println(map);
    }
}
