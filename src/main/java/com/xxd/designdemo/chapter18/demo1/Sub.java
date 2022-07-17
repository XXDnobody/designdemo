package com.xxd.designdemo.chapter18.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter18.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-15  00:14
 * @Description: 减法
 * @Version: 1.0
 */
public class Sub implements Calculator {
    @Override
    public int exec(int a, int b) {
        return a - b;
    }
}
