package com.xxd.designdemo.chapter15;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter15
 * @Author: xxd
 * @CreateTime: 2022-07-24  19:54
 * @Description: 命令模式场景类
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        Receiver receiver = new ConcreteReciver1();
        ConcreteCommand1 command = new ConcreteCommand1(receiver);
        invoker.setCommand(command);
        invoker.action();
    }
}
