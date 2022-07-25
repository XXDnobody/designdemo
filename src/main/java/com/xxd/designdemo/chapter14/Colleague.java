package com.xxd.designdemo.chapter14;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter14
 * @Author: xxd
 * @CreateTime: 2022-07-24  19:21
 * @Description: 抽象同事类
 * @Version: 1.0
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
