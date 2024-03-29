package com.xxd.designdemo.chapter29;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter29
 * @Author: xxd
 * @CreateTime: 2022-07-28  22:35
 * @Description: 场景类
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        //定义一个实现化角色
        Implementor imp = new ConcreteImplementor1();
        //定义一个抽象化角色
        Abstraction abs = new RefinedAbstraction(imp);
        //执行
        abs.request();
    }
}
