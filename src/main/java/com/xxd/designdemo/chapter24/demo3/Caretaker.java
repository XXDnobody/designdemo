package com.xxd.designdemo.chapter24.demo3;

import com.xxd.designdemo.chapter24.demo2.Memento;

import java.util.HashMap;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24.demo3
 * @Author: xxd
 * @CreateTime: 2022-07-27  21:57
 * @Description: 备忘录管理员 -多备份
 * @Version: 1.0
 */
public class Caretaker {
    private HashMap<String, Memento> memMap = new HashMap<>();

    public Memento getMemento(String idx) {
        return memMap.get(idx);
    }

    public void setMemento(String idx,Memento memento) {
        this.memMap.put(idx,memento);
    }
}
