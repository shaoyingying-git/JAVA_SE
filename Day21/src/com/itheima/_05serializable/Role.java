package com.itheima._05serializable;

import java.io.Serializable;

public class Role implements Serializable {
    private String name;
    private String weapon;
    private int hp;
    private int mp;
    private int power;

    private int id;

    public Role() {
    }

    public Role(String name, String weapon, int hp, int mp, int power) {
        this.name = name;
        this.weapon = weapon;
        this.hp = hp;
        this.mp = mp;
        this.power = power;
    }


    @Override
    public String toString() {
        return "Role{" +
                "name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", hp=" + hp +
                ", mp=" + mp +
                ", power=" + power +
                '}';
    }
}
