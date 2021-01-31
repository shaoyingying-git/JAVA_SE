package com.itheima._04redPocket;

import java.util.ArrayList;

public class GroupMaster extends User{
    public GroupMaster() {
    }

    public GroupMaster(String name, double money) {
        super(name, money);
    }

    /**
     *  发红包方法
     *
     * @param count     红包总个数
     * @param redPocketMoney    红包总金额
     * @return  返回的红包集合
     */
    public ArrayList<Double> sendRedPocket(int count, int redPocketMoney) {
        // 1. 判断余额是否足够
        // 如果红包总金额, 大于群主的余额
        if (redPocketMoney > getMoney()) {
            return null;
        }
        // 2. 将红包等分
        // 将元变成分
        redPocketMoney = redPocketMoney * 100;

        // 等分
        int perMoney = redPocketMoney / count;
        // 获取剩下的一点钱
        int leftMoney = redPocketMoney % count;

        // 3. 将每一份金额添加到集合中
        // 创建ArrayList集合
        ArrayList<Double> list = new ArrayList<>();

        // count次的循环  几次的循环, 就写  几.fori
        // 不添加最后一个红包
        for (int i = 0; i < count - 1; i++) {
            list.add(perMoney / 100.0);
        }

        // 把剩下的一点钱, 放到最后一个红包中
        list.add((perMoney + leftMoney) / 100.0);

        // 4. 减少自己的余额
        setMoney(getMoney() - (redPocketMoney / 100.0));

        // 5. 将红包返回
        return list;
    }



}
