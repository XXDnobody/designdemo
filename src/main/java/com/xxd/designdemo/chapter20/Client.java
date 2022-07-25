package com.xxd.designdemo.chapter20;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter20
 * @Author: xxd
 * @CreateTime: 2022-07-25  22:11
 * @Description: 迭代器模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Aggregate agg = new ConcreteAggregate();
        agg.add("abc");
        agg.add("aaa");
        agg.add("1223");
        Iterator iterator = agg.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
