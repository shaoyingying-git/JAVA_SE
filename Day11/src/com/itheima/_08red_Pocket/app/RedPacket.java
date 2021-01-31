package com.itheima._08red_Pocket.app;

import com.itheima._08red_Pocket.red.RedPacketFrame;

// 1. 创建一个类, 继承RedPacketFrame
public class RedPacket extends RedPacketFrame {
    // 2. 生成构造方法  父类只有一个有参构造, 没有空参构造
    /**
     * 构造方法：生成红包界面。
     *
     * @param title 界面的标题
     */
    public RedPacket(String title) {
        super(title);
    }

}
