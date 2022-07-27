package com.xxd.designdemo.chapter24.demo3;

import com.xxd.designdemo.chapter24.demo2.Originator;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24.demo3
 * @Author: xxd
 * @CreateTime: 2022-07-27  21:58
 * @Description: 多备份的备忘录
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento("001",originator.createMemento());
        caretaker.setMemento("002",originator.createMemento());
        originator.restoreMemento(caretaker.getMemento("001"));
    }
}
