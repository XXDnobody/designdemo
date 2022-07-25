package com.xxd.designdemo.chapter20;

import java.util.Vector;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter20
 * @Author: xxd
 * @CreateTime: 2022-07-25  22:10
 * @Description: 具体容器
 * @Version: 1.0
 */
public class ConcreteAggregate implements Aggregate{
    private Vector vector = new Vector();
    @Override
    public void add(Object object) {
        this.vector.add(object);
    }

    @Override
    public void remove(Object object) {
        this.remove(object);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(this.vector);
    }
}
