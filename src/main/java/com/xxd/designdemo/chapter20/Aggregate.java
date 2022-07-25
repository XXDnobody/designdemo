package com.xxd.designdemo.chapter20;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter20
 * @Author: xxd
 * @CreateTime: 2022-07-25  22:09
 * @Description: 抽象容器
 * @Version: 1.0
 */
public interface Aggregate {
    public void add(Object object);
    public void remove(Object object);
    public Iterator iterator();
}
