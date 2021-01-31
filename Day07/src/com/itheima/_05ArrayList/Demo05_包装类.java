package com.itheima._05ArrayList;

import java.util.ArrayList;

publ ic class Demo05_包装类 {
    public static void
    main(String[] args) {

        // 只需要将泛型定义成包装类, 其他所有操作都使用基本数据类型就可以
        // 因为里面有自动类型转换(自动装拆箱)

        ArrayList<Integer> list = new ArrayList<>();
        // 直接添加基本数据类型
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(100);
        list.add(9999);

        // 遍历
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i);
            System.out.println(a);
        }



        System.out.println(list);
    }
}
