package com.xxd.designdemo.chapter24.demo4;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24.demo4
 * @Author: xxd
 * @CreateTime: 2022-07-27  22:08
 * @Description: 备忘录管理者
 * @Version: 1.0
 */
public class Caretaker {
    private IMemento memento;

    public IMemento getMemento() {
        return memento;
    }

    public void setMemento(IMemento memento) {
        this.memento = memento;
    }
}
