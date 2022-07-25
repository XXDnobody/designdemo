package com.xxd.designdemo.chapter8;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter8
 * @Author: xxd
 * @CreateTime: 2022-07-18 23:25
 * @Description: TODO
 * @Version: 1.0
 */
public class ConcreteCreator extends Creator {
    @Override
    public <T extends Product> T createProduct(Class<T> c) {
        Product product = null;
        try {
            product = (Product)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            // 异常处理
        }

        return (T)product;

    }
}
