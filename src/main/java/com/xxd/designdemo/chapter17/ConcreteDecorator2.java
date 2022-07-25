package com.xxd.designdemo.chapter17;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter17
 * @Author: xxd
 * @CreateTime: 2022-07-24  21:09
 * @Description: 具体的装饰类2
 * @Version: 1.0
 */
public class ConcreteDecorator2 extends Decorator{
    public ConcreteDecorator2(Component component) {
        super(component);
    }
    private void method2(){
        System.out.println("method 2 修饰");
    }

    @Override
    public void operate() {
        this.method2();
        super.operate();
    }
}
