package com.xxd.designdemo.chapter7;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter7
 * @Author: xxd
 * @CreateTime: 2022-07-18 22:40
 * @Description: 单例模式
 * @Version: 1.0
 */
public class Singleton {
    private static final Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getSingleton() {
        return singleton;
    }

    public static void doSomething() {

    }

}
