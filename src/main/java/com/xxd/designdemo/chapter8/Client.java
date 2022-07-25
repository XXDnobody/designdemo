package com.xxd.designdemo.chapter8;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter8
 * @Author: xxd
 * @CreateTime: 2022-07-18 23:26
 * @Description: TODO
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Creator creator = new ConcreteCreator();
        ConcreteProduct1 product = creator.createProduct(ConcreteProduct1.class);
        // .....
    }
}
