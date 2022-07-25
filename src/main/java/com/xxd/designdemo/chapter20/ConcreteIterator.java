package com.xxd.designdemo.chapter20;

import java.util.Vector;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter20
 * @Author: xxd
 * @CreateTime: 2022-07-25  22:05
 * @Description: 具体迭代器
 * @Version: 1.0
 */
public class ConcreteIterator implements Iterator{
    private Vector vector = new Vector();
    public int cursor = 0;

    public ConcreteIterator(Vector vector) {
        this.vector = vector;
    }

    @Override
    public Object next() {
        Object result = null;
        if(this.hasNext()){
            result = this.vector.get(this.cursor++);
        }else{
            result = null;
        }
        return result;
    }

    @Override
    public boolean hasNext() {
        if(this.cursor == this.vector.size()){
            return  false;
        }else {
            return true;
        }
    }

    @Override
    public boolean remove() {
        this.vector.remove(this.cursor);
        return true;
    }
}
