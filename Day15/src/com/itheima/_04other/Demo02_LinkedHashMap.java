package com.itheima._04other;

import java.util.LinkedHashMap;

public class Demo02_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        lhm.put("王老七", 37);
        lhm.put("张三", 23);
        lhm.put("张三", 23);
        lhm.put("张三", 333);
        lhm.put("李四", 24);
        lhm.put("赵四", 44);
        lhm.put("赵四", 45);

        System.out.println(lhm);

    }
}
