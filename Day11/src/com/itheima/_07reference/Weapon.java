package com.itheima._07reference;

/**
 * 这是一个武器类
 */
public class Weapon {
    private String name;

    private int power;

    public Weapon() {
    }

    public Weapon(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
