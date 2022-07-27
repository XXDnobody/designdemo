package com.xxd.designdemo.chapter24.demo4;

import com.xxd.designdemo.chapter24.demo2.Memento;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24.demo4
 * @Author: xxd
 * @CreateTime: 2022-07-27 22:02
 * @Description: 封装更好的发起人角色
 * @Version: 1.0
 */
public class Originator {
    private String state = "";

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    // 创建一个备忘录
    public IMemento createMemento() {
        return new Memento(this.state);
    }

    // 恢复一个备忘录
    public void restoreMemento(IMemento memento) {
        this.setState(((Memento)memento).getState());
    }

    // 内置类
    private class Memento implements IMemento {
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
}
