package com.xxd.designdemo.chapter13;

import java.util.ArrayList;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter13
 * @Author: xxd
 * @CreateTime: 2022-07-21  23:43
 * @Description: TODO
 * @Version: 1.0
 */
public class Deep implements Cloneable{
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Deep deep = null;

        deep = (Deep) super.clone();
        deep.arrayList = (ArrayList<String>) this.arrayList.clone();

        return deep;
    }
}
