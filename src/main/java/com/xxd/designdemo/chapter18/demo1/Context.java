package com.xxd.designdemo.chapter18.demo1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter18.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-15  00:15
 * @Description: 上下文
 * @Version: 1.0
 */
public class Context {
    private Calculator cal = null;

    public Context(Calculator cal) {
        this.cal = cal;
    }

    public int exec(int a, int b, String symbol) {
        return this.cal.exec(a, b);
    }

}
