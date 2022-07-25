package com.xxd.designdemo.chapter11;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter11
 * @Author: xxd
 * @CreateTime: 2022-07-20  22:34
 * @Description: 建造者模式
 * @Version: 1.0
 */
public class Director {
    private Builder builder = new ConcreteProduct();

    public Product getAProduct(){
        builder.setPart();
        return builder.buildProduct();
    }
}
