package com.xxd.designdemo.chapter14;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter14
 * @Author: xxd
 * @CreateTime: 2022-07-24  19:25
 * @Description: 通用中介者
 * @Version: 1.0
 */
public class ConcreteMediator extends Mediator{
    @Override
    public void doSomething1() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }

    @Override
    public void doSomething2() {
        super.c1.selfMethod1();
        super.c2.selfMethod2();
    }
}
