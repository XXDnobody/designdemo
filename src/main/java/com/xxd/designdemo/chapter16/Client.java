package com.xxd.designdemo.chapter16;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter16
 * @Author: xxd
 * @CreateTime: 2022-07-24  20:40
 * @Description: 责任链模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        Response response = handler1.handlerMessage(new Request());
    }
}
