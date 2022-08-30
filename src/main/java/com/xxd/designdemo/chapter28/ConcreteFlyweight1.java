package com.xxd.designdemo.chapter28;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter28
 * @Author: xxd
 * @CreateTime: 2022-07-28  22:06
 * @Description: 具体享元角色
 * @Version: 1.0
 */
public class ConcreteFlyweight1 extends Flyweight{

    //接受外部状态
    public ConcreteFlyweight1(String extrinsic) {
        super(extrinsic);
    }

    @Override
    public void operate() {
        //业务逻辑
    }
}
