package com.xxd.designdemo.chapter26;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter26
 * @Author: xxd
 * @CreateTime: 2022-07-27 23:11
 * @Description: 抽象环境角色
 * @Version: 1.0
 */
public abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void handle1();

    public abstract void handle2();
}
