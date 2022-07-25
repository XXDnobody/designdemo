package com.xxd.designdemo.chapter10;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter10
 * @Author: xxd
 * @CreateTime: 2022-07-19 22:41
 * @Description: 模板方法模式
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("-----H1型号悍马-----");
        System.out.println("H1型号的悍马是否需要喇叭声响？ 0 -不需要  1-需要");
        String type = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        HummerH1Model h1 = new HummerH1Model();
        if (type.equals("0")) {
            h1.setAlarmFlag(false);
        }
        h1.run();
        System.out.println("H2悍马");
        HummerH2Model h2 = new HummerH2Model();
        h2.run();
    }
}
