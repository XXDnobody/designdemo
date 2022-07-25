package com.xxd.designdemo.chapter17;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter17
 * @Author: xxd
 * @CreateTime: 2022-07-24  21:12
 * @Description: 装饰模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component = new ConcreteDecorator1(component);
        component = new ConcreteDecorator2(component);
        component.operate();
    }
}
