package com.itheima._04syn.demo01;

public class Demo01_同步 {
    public static void main(String[] args) {
        // 开启两条线程, 这两条线程分别不断的调用print1(), print2()

        Printer p = new Printer();
        new Thread() {
            @Override
            public void run() {
                // System.out.println(p);
                while (true) {
                    p.print1();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                // Printer p = new Printer();
                // System.out.println(p);
                while (true) {
                    p.print2();
                }
            }
        }.start();

    }
}
