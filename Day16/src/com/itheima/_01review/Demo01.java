package com.itheima._01review;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map
        特点: 1. 键值对 2. 键是唯一的  3. 一个键最多对应一个值

        Map<K, V>

        增加:
            put(key, value)
        删除:
            remove(key)
        修改:
            put(key, value), 如果键相同, 值覆盖
        查询:
            get(key)

        其他:
            size(): 键值对的个数
            containsKey(key):
            containsValue(value):

            Set<K> keySet(): 获取所有键的集合
            Collection<V> values(): 获取所有值的集合

            Set<Map.Entry<K, V>> entrySet() : 获取所有键值对的集合


        HashMap如果键是自定义对象, 想保证键的唯一, 需要重写hashCode() equals()
        LinkedHashMap, 保证键的唯一, 保证怎么存就怎么取


 */
public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("中国", "深圳");
        map.put("美国", "纽约");
        map.put("法国", "巴黎");
        map.put("新西兰", "惠灵顿");
        // demo01(map);

        // 通过键值对的方式
        // 获取Map集合中所有键值对的集合
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        // 迭代器
        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + "=" + value);
        }


        // 增强for
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }

    private static void demo01(HashMap<String, String> map) {
        // 通过键找值的方式
        // 获取Map集合中所有键的集合
        Set<String> keySet = map.keySet();
        // 迭代器
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }


        // 增强for
        for (String key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
    }
}
