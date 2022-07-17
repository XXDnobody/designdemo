package com.xxd.designdemo.chapter2;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter2
 * @Author: xxd
 * @CreateTime: 2022-07-16  15:33
 * @Description: TODO
 * @Version: 1.0
 */
public class Rifle extends AbstractGun{

    @Override
    void shot() {
        System.out.printf("步枪招呼");
    }
}
