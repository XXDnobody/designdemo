package com.xxd.designdemo.chapter27;

import com.xxd.designdemo.chapter26.Context;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter27
 * @Author: xxd
 * @CreateTime: 2022-07-28  21:36
 * @Description: 抽象表达式
 * @Version: 1.0
 */
public abstract class Expression {
    public abstract Object interpretter(Context ctx);
}
