package com.xxd.designdemo.chapter29;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter29
 * @Author: xxd
 * @CreateTime: 2022-07-28 22:32
 * @Description: 抽象化角色
 * @Version: 1.0
 */
public abstract class Abstraction {
    // 定义对实现化角色的引用
    private Implementor imp;

    public Abstraction(Implementor imp) {
        this.imp = imp;
    }

    // 自身的行为和属性
    public void request() {
        this.imp.doSomething();
    }

    // 获得实现化角色
    public Implementor getImp() {
        return imp;
    }
}
