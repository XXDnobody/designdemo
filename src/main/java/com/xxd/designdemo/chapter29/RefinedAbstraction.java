package com.xxd.designdemo.chapter29;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter29
 * @Author: xxd
 * @CreateTime: 2022-07-28  22:34
 * @Description: 具体抽象化角色
 * @Version: 1.0
 */
public class RefinedAbstraction extends Abstraction{
    //覆写构造函数
    public RefinedAbstraction(Implementor imp) {
        super(imp);
    }

    @Override
    public void request() {
        //业务处理
        super.request();
        super.getImp().doAnything();
    }

}
