package com.itheima._03foreach;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class Demo01_键找值 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(4, "钟灵");
        map.put(2, "王语嫣");
        map.put(16, "木婉清");
        map.put(19, "阿紫");

        // 先获取所有键的集合
        Set<Integer> keySet = map.keySet();
        // 通过增强for循环, 获取每一个键
        for (Integer key : keySet) {
            // 通过键获取值
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
