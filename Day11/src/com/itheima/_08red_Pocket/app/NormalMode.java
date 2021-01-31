package com.itheima._08red_Pocket.app;

import com.itheima._08red_Pocket.red.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        // 计算等分的金额
        int perMoney = totalMoney / totalCount;
        // 计算出剩下的一点钱
        int leftMoney = totalMoney % totalCount;
        // 创建集合对象
        ArrayList<Integer> list = new ArrayList<>();
        // 向集合中添加钱, 最后一个先不添加
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(perMoney);
        }
        // 添加最后一个
        list.add(perMoney + leftMoney);

        return list;
    }
}
