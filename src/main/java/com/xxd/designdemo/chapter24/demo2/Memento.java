package com.xxd.designdemo.chapter24.demo2;

import java.util.HashMap;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter24.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-27  21:39
 * @Description: 备忘录角色
 * @Version: 1.0
 */
public class Memento {
    private HashMap<String,Object> stateMap;

    public Memento(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }

    public HashMap<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(HashMap<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
