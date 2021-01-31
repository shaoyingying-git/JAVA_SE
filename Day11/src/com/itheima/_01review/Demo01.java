package com.itheima._01review;
/*

    接口
        定义:  public interface 接口名 {

        }

        实现:  public class 类  implements 接口 {}


        接口中的内容:
            抽象方法
                [public abstract] 返回值类型 方法名(参数列表);
            默认方法
                [public] default 返回值类型 方法名(参数列表) {  }
            静态方法
                [public] static 返回值类型 方法名(参数列表) {  }
            私有方法
                普通私有方法
                    private 返回值类型 方法名(参数列表) {  }
                静态私有方法
                    private static 返回值类型 方法名(参数列表) {  }

            自定义常量
                [public static final] 数据类型  常量名  =  值;


            接口的特点:
                1. 接口不能创建对象
                2. 接口中没有构造方法


            类在继承父类的同时, 实现多个接口

            接口和接口之间是继承关系, 可以多继承


    多态
        多态的前提:
            1. 要有继承关系(子父类)
            2. 要有方法的重写
            3. 要有父类引用指向子类对象

        Fu fu = new Zi(); // 向上转型

        多态的弊端:
            父类引用不能直接使用子类特有的属性和行为

        向下转型(强转):   ((Zi) fu).特有内容




 */
public class Demo01 {
}
