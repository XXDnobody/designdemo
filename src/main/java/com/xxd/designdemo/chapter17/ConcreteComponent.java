package com.xxd.designdemo.chapter17;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter17
 * @Author: xxd
 * @CreateTime: 2022-07-24  21:07
 * @Description: 具体构件
 * @Version: 1.0
 */
public class ConcreteComponent extends Component{
    @Override
    public void operate() {
        System.out.println("do something");
    }
}
