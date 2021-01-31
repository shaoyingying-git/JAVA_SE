package com.itheima._02face_object.test06;


/**
 * 这是一个电脑类
 */
public class Computer {
    /**
     * 品牌
     */
    private String brand;

    /**
     * cpu
     */
    private String cpu;

    /**
     * 空参构造
     */
    public Computer() {}

    /**
     * 有参构造
     */
    public Computer(String brand, String cpu) {
        this.brand = brand;
        this.cpu = cpu;
    }

    /**
     * 获取品牌
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 修改品牌
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取cpu
     */
    public String getCpu() {
        return cpu;
    }

    /**
     * 修改cpu
     */
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

}
