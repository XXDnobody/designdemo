package com.xxd.designdemo.chapter12;

import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter12
 * @Author: xxd
 * @CreateTime: 2022-07-21  22:11
 * @Description: TODO
 * @Version: 1.0
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target = null;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        return method.invoke(this.target,objects);
    }
}
