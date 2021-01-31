package com.itheima._04generic;

/**
 * 我的泛型类
 */
public class MyGenericClass<Q> {
    // 创建Q类型的成员变量
    private Q q;

    public Q getQ() {
        return q;
    }

    public void setQ(Q q) {
        this.q = q;
    }

    /*
        泛型方法
     */
    public <W> void genericMethod(W w) {
        System.out.println(w);
    }

}
