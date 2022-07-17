package com.xxd.designdemo.chapter2;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter2
 * @Author: xxd
 * @CreateTime: 2022-07-16  15:49
 * @Description: 狙击手
 * @Version: 1.0
 */
public class Snipper {
    private AUG aug;

    public void setAug(AUG aug) {
        this.aug = aug;
    }

    public void killEnemy(){
        aug.zoomOut();
        aug.shoot();
    }

}
