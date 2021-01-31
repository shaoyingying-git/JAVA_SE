package com.itheima._03method;
/*

    getName()
    setName(String name)

    Thread(String name): 不好用
    Thread(Runnable r, String name)

 */
public class Demo01_名字相关 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();
        MyThread mt3 = new MyThread();

        mt1.setName("线程一");
        mt2.setName("线程二");
        mt3.setName("线程三");

        mt1.start();
        mt2.start();
        mt3.start();


        MyRunnable mr = new MyRunnable();


        new Thread(mr, "线程1").start();
        new Thread(mr, "线程2").start();
        new Thread(mr, "线程3").start();

    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
//         System.out.println(getName());
        System.out.println(Thread.currentThread().getName());
    }
}


class MyThread extends Thread {



    @Override
    public void run() {
        // set方法不要写在run方法中
//         setName("线程一");

        System.out.println(getName());
    }
}
