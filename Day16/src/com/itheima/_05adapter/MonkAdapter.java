package com.itheima._05adapter;

// 抽象的作用只是让这个类不能创建对象
public abstract class MonkAdapter implements Monk {
    @Override
    public void daZuo() {}

    @Override
    public void nianJing() {}

    @Override
    public void chiZhai() {}

    @Override
    public void paoNiu() {}

    @Override
    public void chiRou() {}
}
