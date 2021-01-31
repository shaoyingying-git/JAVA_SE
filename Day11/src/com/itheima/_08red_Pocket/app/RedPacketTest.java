package com.itheima._08red_Pocket.app;
// 3. 创建测试类
public class RedPacketTest {
    public static void main(String[] args) {
        // 4. 创建RedPacket对象
        RedPacket rp = new RedPacket("黑马发红包");

        // 设置群主名称
        rp.setOwnerName("林雨萍");
        // 设置打开方式
        // 传入的是OpenMode的子类对象
        // rp.setOpenWay(new NormalMode());
        rp.setOpenWay(new RandomMode());

    }
}
