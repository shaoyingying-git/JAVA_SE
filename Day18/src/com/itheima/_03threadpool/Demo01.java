package com.itheima._03threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        MyRunnable mr = new MyRunnable();

        // 提交线程
        pool.submit(mr);
        pool.submit(mr);
        pool.submit(mr);
        pool.submit(mr);

    }
}
