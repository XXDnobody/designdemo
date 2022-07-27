package com.xxd.designdemo.chapter22;

import java.util.Vector;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter22
 * @Author: xxd
 * @CreateTime: 2022-07-26  21:59
 * @Description: 被观察者
 * @Version: 1.0
 */
public abstract class Subject {
    private Vector<Observer> observerVector = new Vector<>();

    public void addObserver(Observer o){
        this.observerVector.add(o);
    }

    public void delObserver(Observer o){
        this.observerVector.remove(o);
    }

    public void notifyObservers(){
        for (Observer observer : this.observerVector) {
            observer.update();
        }
    }
}
