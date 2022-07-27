package com.xxd.designdemo.chapter21;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter21
 * @Author: xxd
 * @CreateTime: 2022-07-26 21:49
 * @Description: 组合模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
    }

    public static void display(Composite root) {
        for (Component child : root.getChildren()) {
            if (child instanceof Leaf) {
                child.doSomething();
            } else {
                display((Composite)child);
            }
        }

    }
}
