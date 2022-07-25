package com.xxd.designdemo.chapter13;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter13
 * @Author: xxd
 * @CreateTime: 2022-07-21  23:17
 * @Description: TODO
 * @Version: 1.0
 */
public class PrototypeClass implements Cloneable{
    @Override
    protected PrototypeClass clone() throws CloneNotSupportedException {
        PrototypeClass prototypeClass = null;
        prototypeClass = (PrototypeClass)super.clone();
        return prototypeClass;
    }
}
