package com.xxd.designdemo.chapter12;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter12
 * @Author: xxd
 * @CreateTime: 2022-07-21  22:17
 * @Description: TODO
 * @Version: 1.0
 */
public class BerforeAdvice implements IAdvice{
    @Override
    public void exec() {
        System.out.println("我是前置通知！！！");
    }
}
