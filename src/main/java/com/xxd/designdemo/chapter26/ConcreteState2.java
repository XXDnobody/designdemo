package com.xxd.designdemo.chapter26;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter26
 * @Author: xxd
 * @CreateTime: 2022-07-27  23:13
 * @Description: TODO
 * @Version: 1.0
 */
public class ConcreteState2 extends State{
    @Override
    public void handle1() {
        super.context.setCurrentState(Context.STATE1);
        super.context.handle1();
    }

    @Override
    public void handle2() {
        //本状态下必须完成的事情
        System.out.println("状态2执行");
    }
}
