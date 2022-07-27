package com.xxd.designdemo.chapter26;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter26
 * @Author: xxd
 * @CreateTime: 2022-07-27  23:12
 * @Description: 具体环境角色
 * @Version: 1.0
 */
public class Context {
    public final static State STATE1 = new ConcreteState1();
    public final static State STATE2 = new ConcreteState2();

    private State CurrentState;

    public State getCurrentState() {
        return CurrentState;
    }

    public void setCurrentState(State currentState) {
        this.CurrentState = currentState;
        //切换状态
        this.CurrentState.setContext(this);
    }

    public void handle1(){
        this.CurrentState.handle1();
    }
    public void handle2(){
        this.CurrentState.handle2();
    }
}
