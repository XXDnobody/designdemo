package com.xxd.designdemo.chapter14;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter14
 * @Author: xxd
 * @CreateTime: 2022-07-24 19:22
 * @Description: 具体同事类
 * @Version: 1.0
 */
public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void selfMethod2() {

    }

    public void depMethod1() {
        super.mediator.doSomething2();
    }
}
