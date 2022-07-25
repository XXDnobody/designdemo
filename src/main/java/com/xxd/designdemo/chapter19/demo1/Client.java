package com.xxd.designdemo.chapter19.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter19.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-25  21:31
 * @Description: 适配器模式（类适配器）
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();
        Target target2 = new Adapter();
        target2.request();
    }
}
