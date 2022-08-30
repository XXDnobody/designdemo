package com.xxd.designdemo.chapter27;

import com.xxd.designdemo.chapter26.Context;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter27
 * @Author: xxd
 * @CreateTime: 2022-07-28  21:38
 * @Description: 非终结符表达式
 * @Version: 1.0
 */
public class NonterminalExpression extends Expression{
    //每个非终结符表达式都会对其他表达式产生依赖
    public NonterminalExpression(Expression... expressions){

    }

    @Override
    public Object interpretter(Context ctx) {
        return null;
    }
}
