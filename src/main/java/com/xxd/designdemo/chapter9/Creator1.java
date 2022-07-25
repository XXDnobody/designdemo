package com.xxd.designdemo.chapter9;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter9
 * @Author: xxd
 * @CreateTime: 2022-07-18  23:49
 * @Description: TODO
 * @Version: 1.0
 */
public class Creator1 extends AbstractCreator{
    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
