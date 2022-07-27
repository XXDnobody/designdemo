package com.xxd.designdemo.chapter22;

import com.xxd.designdemo.chapter18.demo1.Sub;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter22
 * @Author: xxd
 * @CreateTime: 2022-07-26  22:02
 * @Description: 具体被观察者
 * @Version: 1.0
 */
public class ConcreteSubject extends Subject {
    public void doSomething(){
        // todo something .....

        super.notifyObservers();
    }
}
