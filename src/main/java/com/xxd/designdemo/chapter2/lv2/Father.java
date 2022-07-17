package com.xxd.designdemo.chapter2.lv2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter2.lv2
 * @Author: xxd
 * @CreateTime: 2022-07-16  16:00
 * @Description: TODO
 * @Version: 1.0
 */
public class Father {

    public Collection doSomething(Map map) {
        System.out.println("父类被执行");
        return map.values();
    }
}
