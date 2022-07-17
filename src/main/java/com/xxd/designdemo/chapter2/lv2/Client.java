package com.xxd.designdemo.chapter2.lv2;

import java.util.HashMap;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter2.lv2
 * @Author: xxd
 * @CreateTime: 2022-07-16 16:03
 * @Description: 覆盖或实现父类的方法时输入参数可以被放大
 * @Version: 1.0
 */
public class Client {
    public static void invoker() {
        // Father f = new Father();
        // 子类的输入必须比超类相同或者更宽松，不然子类执行的是自己的逻辑。
        Son f = new Son();
        HashMap map = new HashMap();
        f.doSomething(map);

    }

    public static void main(String[] args) {
        invoker();
    }
}
