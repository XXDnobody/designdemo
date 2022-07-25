package com.xxd.designdemo.chapter12;


import org.springframework.aop.BeforeAdvice;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter12
 * @Author: xxd
 * @CreateTime: 2022-07-21 22:13
 * @Description: TODO
 * @Version: 1.0
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        if (true) {
            (new BerforeAdvice()).exec();
        }
        return (T)Proxy.newProxyInstance(loader, interfaces, handler);
    }

}
