package com.xxd.designdemo.chapter24.demo2;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-27  21:38
 * @Description: 发起人角色
 * @Version: 1.0
 */
public class Originator {
    private String state1 = "";
    private String state2 = "";
    private String state3 = "";

    public String getState1() {
        return state1;
    }

    public void setState1(String state1) {
        this.state1 = state1;
    }

    public String getState2() {
        return state2;
    }

    public void setState2(String state2) {
        this.state2 = state2;
    }

    public String getState3() {
        return state3;
    }

    public void setState3(String state3) {
        this.state3 = state3;
    }

    public Memento createMemento(){
        return new Memento(BeanUtils.backupPro(this));
    }

    public void restoreMemento(Memento memento){
        BeanUtils.restoreProp(this,memento.getStateMap());
    }

}
