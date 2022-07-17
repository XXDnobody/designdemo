package com.xxd.designdemo.chapter18.demo1;

import java.util.Arrays;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter18.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-15  00:17
 * @Description: 场景类
 * @Version: 1.0
 */
public class Client {
    public final static String ADD_SYMBOL = "+";
    public final static String SUB_SYMBOL = "-";

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        String symbol = args[1];
        int b = Integer.parseInt(args[2]);
        System.out.println("输入。。" + Arrays.toString(args));

        Context context = null;

        if (symbol.equals(ADD_SYMBOL)) {
            context = new Context(new Add());
        } else if (symbol.equals(SUB_SYMBOL)) {
            context = new Context(new Sub());
        }
        System.out.println("运行结果：" + a + symbol + b + "=" + context.exec(a, b, symbol));
    }
}
