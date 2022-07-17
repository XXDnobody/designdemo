package com.xxd.designdemo.chapter2;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter2
 * @Author: xxd
 * @CreateTime: 2022-07-16  15:35
 * @Description: TODO
 * @Version: 1.0
 */
public class Soldier {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy(){
        System.out.println("士兵开始杀敌人");
        gun.shot();
    }
}
