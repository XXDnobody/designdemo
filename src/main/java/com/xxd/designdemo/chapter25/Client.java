package com.xxd.designdemo.chapter25;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter25
 * @Author: xxd
 * @CreateTime: 2022-07-27  22:29
 * @Description: 访问者模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element element = ObjectStruture.createElement();
            element.accept(new Visitor());
        }
    }
}
