package com.itheima._04other;

import com.itheima._01review.Person;

import java.util.HashMap;
import java.util.Set;

public class Demo01_HashMap存储自定义对象 {
    public static void main(String[] args) {

        HashMap<Person, String> map = new HashMap<>();

        map.put(new Person("梅西", 32), "巴塞罗那");
        map.put(new Person("梅西", 32), "巴塞罗那");
        map.put(new Person("梅西", 32), "巴塞罗那");
        map.put(new Person("C罗", 34), "尤文图斯");
        map.put(new Person("内马尔", 27), "巴黎");
        map.put(new Person("阿扎尔", 30), "切尔西");


        // 遍历并打印map集合
        Set<Person> keySet = map.keySet();
        // 遍历Set集合, 获取每一个键
        for (Person key : keySet) {
            String value = map.get(key);
            System.out.println(key + "=" + value);
        }
    }
}
