package com.ithiema._01review;

public class Demo01 {
    public static void main(String[] args) {
        /*print(new MyInter() {
            @Override
            public int getSum(int a, int b) {
                return a + b;
            }
        });*/


        print(new MyClass() :: get); // 把它想象成是一个接口的子类对象

        // printttt(new MyClass() :: get);

    }

    public static void printttt(int a) {
        System.out.println(a);
    }


    public static void print(MyInter lambda) {
        int sum = lambda.getSum(10,20);
        System.out.println(sum);
    }
}
