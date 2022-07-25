package com.xxd.designdemo.chapter11;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter11
 * @Author: xxd
 * @CreateTime: 2022-07-20 22:33
 * @Description: TODO
 * @Version: 1.0
 */
public class ConcreteProduct extends Builder {
    private Product product = new Product();

    @Override
    public void setPart() {
        //todo 设置顺序
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
