package com.xxd.designdemo.chapter13;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter13
 * @Author: xxd
 * @CreateTime: 2022-07-21  23:34
 * @Description: 浅拷贝测试
 * @Version: 1.0
 */
public class Client1 {
    public static void main(String[] args) throws Exception {
        Thing thing = new Thing();
        thing.setValue("张三");
        Thing clone = (Thing) thing.clone();
        clone.setValue("李四");
        System.out.println(thing.getValue());

    }
}
