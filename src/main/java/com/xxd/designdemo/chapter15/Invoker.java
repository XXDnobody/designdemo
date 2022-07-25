package com.xxd.designdemo.chapter15;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter15
 * @Author: xxd
 * @CreateTime: 2022-07-24 19:53
 * @Description: 调用者Invoker类
 * @Version: 1.0
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action() {
        this.command.execute();
    }
}
