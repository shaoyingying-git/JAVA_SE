package com.itheima._03programing.demo03;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03_lambda作为方法的返回值 {

    public static void main(String[] args) {

        String[] arr = {"zzz", "cba", "nba", "caa", "aba", "a", "aa"};

        // 数组的排序, 使用字典顺序的降序排序
        Arrays.sort(arr, getComparator());

        System.out.println(Arrays.toString(arr));
    }


    /**
     * 创建方法, 此方法可以返回Comparator比较器对象
     */
    public static Comparator<String> getComparator() {
        // 方法的返回值类型是接口, 那么实际返回的是, 该接口的实现类对象
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };*/

        return (o1, o2) -> o2.compareTo(o1);
    }

}
