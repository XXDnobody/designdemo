package com.xxd.designdemo.chapter12;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter12
 * @Author: xxd
 * @CreateTime: 2022-07-21 22:18
 * @Description: TODO
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(subject);
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(),
                myInvocationHandler);
        proxy.doSomething("Finish");

    }
}
