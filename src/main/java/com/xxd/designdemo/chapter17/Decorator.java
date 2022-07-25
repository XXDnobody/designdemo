package com.xxd.designdemo.chapter17;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter17
 * @Author: xxd
 * @CreateTime: 2022-07-24  21:08
 * @Description: 抽象装饰者
 * @Version: 1.0
 */
public abstract class Decorator extends Component{
    private Component component = null;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        this.component.operate();
    }
}
