package com.itheima._04redPocket;

import java.util.ArrayList;

public class RedPocketTest {
    public static void main(String[] args) {

        GroupMaster gm = new GroupMaster("林雨萍", 200);

        Member m1 = new Member("恩泽", 0);
        Member m2 = new Member("丽丽", 0);
        Member m3 = new Member("苗行", 0);

        ArrayList<Double> redPocket = gm.sendRedPocket(3, 300);

        m1.openRedPocket(redPocket);
        m2.openRedPocket(redPocket);
        m3.openRedPocket(redPocket);

        m1.show();
        m2.show();
        m3.show();

        gm.show();


    }
}
