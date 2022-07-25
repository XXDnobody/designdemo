package com.xxd.designdemo.chapter9;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter9
 * @Author: xxd
 * @CreateTime: 2022-07-18  23:51
 * @Description: 抽象工厂模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        AbstractProductA productA1 = creator1.createProductA();
        AbstractProductA productA2 = creator2.createProductA();
        AbstractProductB productB1 = creator1.createProductB();
        AbstractProductB productB2 = creator2.createProductB();

    }
}
