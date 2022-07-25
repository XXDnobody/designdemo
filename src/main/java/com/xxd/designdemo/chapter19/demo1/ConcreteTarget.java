package com.xxd.designdemo.chapter19.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter19.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-25  21:28
 * @Description: TODO
 * @Version: 1.0
 */
public class ConcreteTarget implements Target{

    @Override
    public void request() {
        System.out.println("1111,if you need me,call me");
    }
}
