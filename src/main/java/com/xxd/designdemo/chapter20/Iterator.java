package com.xxd.designdemo.chapter20;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter20
 * @Author: xxd
 * @CreateTime: 2022-07-25  22:05
 * @Description: 抽象迭代器
 * @Version: 1.0
 */
public interface Iterator {
    public Object next();
    public boolean hasNext();
    public boolean remove();
}
