package com.xxd.designdemo.chapter19.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter19.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-25 21:30
 * @Description: 适配器角色
 * @Version: 1.0
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.doSomething();
    }
}
