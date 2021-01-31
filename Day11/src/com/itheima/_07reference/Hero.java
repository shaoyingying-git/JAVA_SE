package com.itheima._07reference;

/**
 * 这是一个英雄类
 */
public class Hero {
    /**
     * 姓名
     */
    private String name;

    /**
     * 武器
     *  类作为成员变量
     */
    private Weapon weapon;

    /**
     * 技能
     */
    private Skill skill;

    public Hero() {
    }

    public Hero(String name, Weapon weapon) {
        this.name = name;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }


    public void show() {
        System.out.println("我是: " + name + ", 我的武器是: " + weapon.getName()
                + ", 它的攻击力为: " + weapon.getPower());
    }

    public void attack() {
        System.out.println(name + "使用" + weapon.getName() + "造成了"
                + weapon.getPower() + "点伤害");

    }


    /**
     * 到六级了, 有大招了
     */
    public void sixLevel(Skill skill) {
        this.skill = skill;
    }


    /**
     * 魔法攻击
     */
    public void skillAttack() {
        skill.release();
    }

}
