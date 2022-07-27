package com.xxd.designdemo.chapter25;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter25
 * @Author: xxd
 * @CreateTime: 2022-07-27  22:25
 * @Description: 具体元素
 * @Version: 1.0
 */
public class ConcreteElement1 extends Element{
    @Override
    public void doSomething() {
        System.out.println("哈哈哈哈");
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
