package com.xxd.designdemo.chapter8;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter8
 * @Author: xxd
 * @CreateTime: 2022-07-18  23:23
 * @Description: 抽象工厂类
 * @Version: 1.0
 */
public abstract class Creator {
    public abstract <T extends  Product> T createProduct(Class<T> c);
}

