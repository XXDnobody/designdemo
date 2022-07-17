package com.xxd.designdemo.chapter2.lv2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter2.lv2
 * @Author: xxd
 * @CreateTime: 2022-07-16  16:02
 * @Description: TODO
 * @Version: 1.0
 */
public class Son extends Father{
//    @Override
    public Collection doSomething(HashMap map){
        System.out.println("子类被执行");
        return map.values();
    }
}
