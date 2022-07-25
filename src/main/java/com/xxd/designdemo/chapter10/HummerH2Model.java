package com.xxd.designdemo.chapter10;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter10
 * @Author: xxd
 * @CreateTime: 2022-07-19 22:37
 * @Description: TODO
 * @Version: 1.0
 */
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("悍马H2发动");
    }

    @Override
    protected void stop() {
        System.out.println("悍马H2停车");
    }

    @Override
    protected void alarm() {
        System.out.println("悍马H2鸣笛");
    }

    @Override
    protected void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的");
    }

    protected boolean isAlarm() {
        return false;
    }
}
