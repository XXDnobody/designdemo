package com.xxd.designdemo.chapter24.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24
 * @Author: xxd
 * @CreateTime: 2022-07-27  21:31
 * @Description: 备忘录管理员角色
 * @Version: 1.0
 */
public class Caretaker {
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
