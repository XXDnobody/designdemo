package com.xxd.designdemo.chapter10;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter10
 * @Author: xxd
 * @CreateTime: 2022-07-19 22:34
 * @Description: 抽象模板类
 * @Version: 1.0
 */
public abstract class HummerModel {
    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    final public void run() {
        this.start();
        this.engineBoom();
        if (this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }

    protected boolean isAlarm() {
        return true;
    }

}
