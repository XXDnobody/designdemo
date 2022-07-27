package com.xxd.designdemo.chapter22;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter22
 * @Author: xxd
 * @CreateTime: 2022-07-26  22:03
 * @Description: 观察者模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        Observer obs = new ConcreteObserver();
        concreteSubject.addObserver(obs);
        concreteSubject.doSomething();
    }
}
