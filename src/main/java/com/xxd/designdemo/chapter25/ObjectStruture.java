package com.xxd.designdemo.chapter25;

import java.util.Random;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter25
 * @Author: xxd
 * @CreateTime: 2022-07-27 22:27
 * @Description: 结构对象
 * @Version: 1.0
 */
public class ObjectStruture {
    public static Element createElement() {
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        } else {
            return new ConcreteElement2();
        }
    }

}
