package com.xxd.designdemo.chapter5.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter5.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-17 21:43
 * @Description: 迪米特法则（最少知识原则）
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        List<Girl> listGirls = new ArrayList<Girl>();
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        teacher.commond(new GroupLeader(listGirls));
    }
}
