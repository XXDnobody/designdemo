package com.xxd.designdemo.chapter25;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter25
 * @Author: xxd
 * @CreateTime: 2022-07-27  22:24
 * @Description: 抽象访问者
 * @Version: 1.0
 */
public interface IVisitor {
    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}
