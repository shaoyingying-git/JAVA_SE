package com.itheima._07reference;

public class HeroTest {
    public static void main(String[] args) {
        // 创建武器对象
        Weapon weapon = new Weapon("三相", 80);
        // 创建英雄对象
        Hero hero = new Hero("伊泽瑞尔", weapon);

        hero.show();
        hero.attack();

        // 传入Skill接口的子类对象
        // new Skill(){} : Skill接口的子类对象
        hero.sixLevel(new Skill() {
            @Override
            public void release() {
                System.out.println("精准弹幕");
            }
        });

        // 魔法攻击
        hero.skillAttack();

    }
}
