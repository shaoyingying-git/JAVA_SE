package com.itheima._04redPocket;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {

    public Member() {
    }

    public Member(String name, double money) {
        super(name, money);
    }

    public void openRedPocket(ArrayList<Double> list) {

        if (list == null) {
            // 结束方法
            System.out.println("真抠!!!");
            return;
        }

        //1. 获取随机数, 随机索引
        Random r = new Random();

//        System.out.println(r);
//        System.out.println(list);
        int randomIndex = r.nextInt(list.size());
        // 获取红包金额
        Double money = list.get(randomIndex);
        // 2. 删除抢到的红包
        list.remove(randomIndex);
        // 3. 修改自己的余额(默认余额为0)
        setMoney(money);
    }
}
