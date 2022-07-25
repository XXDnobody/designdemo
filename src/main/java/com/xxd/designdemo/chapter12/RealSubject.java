package com.xxd.designdemo.chapter12;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter12
 * @Author: xxd
 * @CreateTime: 2022-07-21  22:10
 * @Description: TODO
 * @Version: 1.0
 */
public class RealSubject implements Subject{

    @Override
    public void doSomething(String str) {
        System.out.println("doing something------" + str);
    }
}
