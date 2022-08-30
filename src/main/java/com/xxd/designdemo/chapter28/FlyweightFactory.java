package com.xxd.designdemo.chapter28;

import java.util.HashMap;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter28
 * @Author: xxd
 * @CreateTime: 2022-07-28 22:08
 * @Description: 享元工厂
 * @Version: 1.0
 */
public class FlyweightFactory {
    // 定义一个池容器
    private static HashMap<String, Flyweight> pool = new HashMap<String, Flyweight>() {};

    // 享元工厂
    public static Flyweight getFlyweight(String Extrinsic) {
        // 需要返回的对象
        Flyweight flyweight = null;
        // 在池中没有该对象
        if (pool.containsKey(Extrinsic)) {
            flyweight = pool.get(Extrinsic);
        } else {
            // 根据外部状态创建享元对象
            flyweight = new ConcreteFlyweight1(Extrinsic);
            // 放入池中
            pool.put(Extrinsic, flyweight);
        }
        return flyweight;

    }
}
