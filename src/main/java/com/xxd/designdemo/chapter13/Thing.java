package com.xxd.designdemo.chapter13;

import java.util.ArrayList;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter13
 * @Author: xxd
 * @CreateTime: 2022-07-21 23:26
 * @Description: 浅拷贝
 * @Version: 1.0
 */
public class Thing implements Cloneable {
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Thing thing = null;
            thing = (Thing)super.clone();
        return thing;
    }

    public void setValue(String value) {
        this.arrayList.add(value);
    }

    public ArrayList<String> getValue() {
        return this.arrayList;
    }
}
