package com.xxd.designdemo.chapter2;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter2
 * @Author: xxd
 * @CreateTime: 2022-07-16  15:52
 * @Description: TODO
 * @Version: 1.0
 */
public class Client2 {
    public static void main(String[] args) {
        Snipper sanMao = new Snipper();
//        sanMao.setAug(new AUG());
        sanMao.setAug((AUG) new Rifle());
        sanMao.killEnemy();
    }
}
