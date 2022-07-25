package com.xxd.designdemo.chapter17;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter17
 * @Author: xxd
 * @CreateTime: 2022-07-24  21:09
 * @Description: 具体的装饰类1
 * @Version: 1.0
 */
public class ConcreteDecorator1 extends Decorator{
    public ConcreteDecorator1(Component component) {
        super(component);
    }
    private void method1(){
        System.out.println("method 1 修饰");
    }

    @Override
    public void operate() {
        this.method1();
        super.operate();
    }
}
