package com.xxd.designdemo.chapter12;

import org.aopalliance.intercept.Invocation;
import org.springframework.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter12
 * @Author: xxd
 * @CreateTime: 2022-07-21  22:04
 * @Description: 动态代理类
 * @Version: 1.0
 */
public class GamePlayIH implements InvocationHandler {
    //被代理者
    Class cls = null;
    //被代理的实例
    Object obj = null;

    public GamePlayIH(Object obj) {
        this.obj = obj;
    }

    //调用被代理的方法
    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        Object invoke = method.invoke(this.obj, objects);
        //
        if(method.getName().equalsIgnoreCase("login")){
            System.out.println("有人在用我的账号登录！");
        }
        return invoke;
    }
}
