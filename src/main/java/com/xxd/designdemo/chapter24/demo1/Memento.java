package com.xxd.designdemo.chapter24.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24
 * @Author: xxd
 * @CreateTime: 2022-07-27  21:30
 * @Description: 备忘录角色
 * @Version: 1.0
 */
public class Memento {
    private String state = "";

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
