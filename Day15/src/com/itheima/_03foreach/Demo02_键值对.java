package com.itheima._03foreach;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo02_键值对 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(4, "钟灵");
        map.put(2, "王语嫣");
        map.put(16, "木婉清");
        map.put(19, "阿紫");

        // public Set< Map.Entry<K,V> > entrySet() : 获取到Map集合中所有的键值对对象的集合(Set集合)。
        // 键值对, 也是一种数据类型, Map.Entry<K,V> -> 键值对类型
        Set<Map.Entry<Integer, String>> entrySet = map.entrySet();
        // 遍历Set集合, 获取到的, 每一个键值对对象
        for (Map.Entry<Integer, String>  entry : entrySet) {
            // Map.Entry中, 有getKey() 和getValue()
            Integer key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key + "=" + value);

        }


    }
}
