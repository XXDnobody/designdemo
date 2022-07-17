package com.xxd.designdemo.chapter18.demo2;

import java.util.Arrays;

public class Client {
    public static void main(String[] args) {
        String[] test = new String[]{"1", "*", "3"};
        int a = Integer.parseInt(test[0]);
        String symbol = test[1];
        int b = Integer.parseInt(test[2]);
        System.out.println("输入的参数为：" + Arrays.toString(test));
        System.out.println("运行结果为：" + a + symbol + b + "=" + Calculator.MUL.exec(a, b));
    }

    /**
     * @description:
     * @author: xxd
     * @date: 2022/7/14 23:53
     * @param: [a, b]
     * @return: [java.lang.String, java.lang.String]
     **/
    public void test(String a, String b) {
    }

}
