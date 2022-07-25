package com.xxd.designdemo.chapter15;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter15
 * @Author: xxd
 * @CreateTime: 2022-07-24  19:51
 * @Description: TODO
 * @Version: 1.0
 */
public class ConcreteCommand1 extends Command{
    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        this.receiver.doSomething();
    }
}
