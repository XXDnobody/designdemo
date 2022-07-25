package com.xxd.designdemo.chapter12;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter12
 * @Author: xxd
 * @CreateTime: 2022-07-21  22:25
 * @Description: TODO
 * @Version: 1.0
 */
public class Client2 {
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxy = SubjectDynamicProxy.newProxyInstance(subject);
        proxy.doSomething("11111");



    }
}
