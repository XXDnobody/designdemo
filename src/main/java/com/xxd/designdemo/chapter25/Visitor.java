package com.xxd.designdemo.chapter25;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter25
 * @Author: xxd
 * @CreateTime: 2022-07-27  22:27
 * @Description: 具体访问者
 * @Version: 1.0
 */
public class Visitor implements IVisitor{
    @Override
    public void visit(ConcreteElement1 el1) {
        el1.doSomething();
    }

    @Override
    public void visit(ConcreteElement2 el2) {
        el2.doSomething();
    }
}
