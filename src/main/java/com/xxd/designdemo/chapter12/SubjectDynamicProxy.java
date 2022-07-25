package com.xxd.designdemo.chapter12;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter12
 * @Author: xxd
 * @CreateTime: 2022-07-21  22:23
 * @Description: TODO
 * @Version: 1.0
 */
public class SubjectDynamicProxy extends DynamicProxy{
    public static <T> T newProxyInstance(Subject subject){
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Class<?>[] interfaces = subject.getClass().getInterfaces();
        MyInvocationHandler handler = new MyInvocationHandler(subject);
        return  newProxyInstance(classLoader,interfaces,handler);
    }
}
