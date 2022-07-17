package com.xxd.designdemo.chapter3;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter3
 * @Author: xxd
 * @CreateTime: 2022-07-16  16:57
 * @Description: 依赖倒置原则
 * @Version: 1.0
 */
public class Client {
    //依赖的三种写法
    //1.构造函数传递依赖对象
    //2.Setter方法传递依赖对象
    //3.接口声明依赖对象

    public static void main(String[] args) {
        IDriver zhangSan = new Driver();
        ICar benz = new Benz();
        ICar bmw = new BMW();
        zhangSan.drive(benz);
        zhangSan.drive(bmw);
    }
}
