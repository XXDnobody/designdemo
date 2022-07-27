package com.xxd.designdemo.chapter22;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter22
 * @Author: xxd
 * @CreateTime: 2022-07-26  22:03
 * @Description: 具体观察者
 * @Version: 1.0
 */
public class ConcreteObserver implements Observer{
    @Override
    public void update() {
        System.out.println("接收到信息，开始处理、、、");
    }
}
