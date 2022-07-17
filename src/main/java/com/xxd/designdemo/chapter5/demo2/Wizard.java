package com.xxd.designdemo.chapter5.demo2;

import java.util.Random;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter5.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-17 21:45
 * @Description: TODO
 * @Version: 1.0
 */
public class Wizard {
    private Random rand = new Random(System.currentTimeMillis());

    private int first() {
        System.out.println("执行第一个方法");
        return rand.nextInt(100);
    }

    private int second() {
        System.out.println("执行第二个方法");
        return rand.nextInt(100);
    }

    private int third() {
        System.out.println("执行第三个方法");
        return rand.nextInt(100);
    }

    public void installWizard() {
        int first = this.first();
        if (first > 50) {
            int second = second();
            if(second > 50){
                int third = third();
                if(third > 50){
                    this.first();
                }
            }
        }
    }
}
