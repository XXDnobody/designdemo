package com.xxd.designdemo.chapter24.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24
 * @Author: xxd
 * @CreateTime: 2022-07-27 21:32
 * @Description: TODO
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        // 定义发起人
        Originator originator = new Originator();
        // 定义备忘录管理员
        Caretaker caretaker = new Caretaker();
        // 创建备忘录
        caretaker.setMemento(originator.createMemento());
        // 恢复备忘录
        originator.restoreMemento(caretaker.getMemento());
    }
}
