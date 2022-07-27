package com.xxd.designdemo.chapter23;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter23
 * @Author: xxd
 * @CreateTime: 2022-07-26 22:24
 * @Description: 门面对象
 * @Version: 1.0
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public void methodA() {
        this.a.doSomethingA();
    }

    public void methodB() {
        this.b.doSomethingB();
    }

    public void methodC() {
        this.c.doSomethingC();
    }
}
