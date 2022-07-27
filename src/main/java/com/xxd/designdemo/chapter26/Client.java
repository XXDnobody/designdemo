package com.xxd.designdemo.chapter26;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter26
 * @Author: xxd
 * @CreateTime: 2022-07-27  23:17
 * @Description: 状态模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //定义环境角色
        Context context = new Context();
        //初始化状态
        context.setCurrentState(new ConcreteState1());
        context.handle1();
        context.handle2();
        context.handle1();
        System.out.println("111111111");
    }

}
