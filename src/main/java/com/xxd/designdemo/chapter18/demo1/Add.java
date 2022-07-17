package com.xxd.designdemo.chapter18.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter18.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-15  00:02
 * @Description: 具体策略：加法
 * @Version: 1.0
 */
public class Add implements Calculator{
    @Override
    public int exec(int a, int b) {
        return a + b;
    }
}
