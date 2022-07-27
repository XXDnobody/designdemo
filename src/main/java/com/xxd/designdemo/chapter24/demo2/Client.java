package com.xxd.designdemo.chapter24.demo2;


/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-27  21:50
 * @Description: 备忘录场景类
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Originator ori = new Originator();
        Caretaker caretaker = new Caretaker();
        ori.setState1("中国");
        ori.setState2("强盛");
        ori.setState3("繁荣");
        System.out.println("初始化状态。。。\n" + ori);

        caretaker.setMemento(ori.createMemento());
        ori.setState1("软件");
        ori.setState2("架构");
        ori.setState3("优秀");
        System.out.println("修改后的状态  \n" + ori);

        ori.restoreMemento(caretaker.getMemento());
        System.out.println("恢复后的状态 \n" + ori);

    }

}
