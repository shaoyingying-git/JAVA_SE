package com.itheima._08red_Pocket.app;

import com.itheima._08red_Pocket.red.OpenMode;

import java.util.ArrayList;
import java.util.Random;

public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        // 创建随机数对象
        Random r = new Random();
        // 用来记录剩余的金额
        int leftMoney = totalMoney;
        // 用来记录剩余红包个数
        int leftCount = totalCount;
        // 创建集合
        ArrayList<Integer> list = new ArrayList<>();

        // 最后一个不用计算, 剩下多少钱就是最后一个包的金额
        for (int i = 0; i < totalCount - 1; i++) {
            // 将红包等分
            int perMoney = leftMoney / leftCount;
            // 红包范围 (0.01元  ~  等分 * 2)
            int min = 1; // 1分
            int max = perMoney * 2;

            // 计算随机红包金额
            int money = (int) (r.nextDouble() * max);

            // 极限值的判断
            money = money < 1 ? 1 : money;

            list.add(money);

            // 修改剩余金额和剩余红包个数
            leftMoney -= money;
            leftCount--;
        }

        // 剩多少钱都给最后一个包
        list.add(leftMoney);

        return list;
    }
}
