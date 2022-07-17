package com.xxd.designdemo.chapter2;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter2
 * @Author: xxd
 * @CreateTime: 2022-07-16  15:38
 * @Description: TODO
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Soldier sanMao  = new Soldier();
        sanMao.setGun(new Rifle());
        sanMao.killEnemy();
    }
}
