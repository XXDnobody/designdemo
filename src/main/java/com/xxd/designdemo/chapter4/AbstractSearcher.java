package com.xxd.designdemo.chapter4;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter4
 * @Author: xxd
 * @CreateTime: 2022-07-17 21:13
 * @Description: TODO
 * @Version: 1.0
 */
public abstract class AbstractSearcher {
    protected PettyGirl pettyGirl;

    public AbstractSearcher(PettyGirl pettyGirl) {
        this.pettyGirl = pettyGirl;
    }

    public abstract void show();
}
