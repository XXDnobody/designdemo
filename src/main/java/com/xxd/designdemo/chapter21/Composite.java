package com.xxd.designdemo.chapter21;

import java.util.ArrayList;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter21
 * @Author: xxd
 * @CreateTime: 2022-07-26  21:47
 * @Description: 树枝构件
 * @Version: 1.0
 */
public class Composite extends Component{
    private ArrayList<Component> componentArrayList = new ArrayList<>();
    public void add(Component component){
        this.componentArrayList.add(component);
    }
    public void remove(Component component){
        this.componentArrayList.remove(component);
    }
    public ArrayList<Component> getChildren(){
        return this.componentArrayList;
    }
}
