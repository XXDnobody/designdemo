package com.xxd.designdemo.chapter27;

import com.xxd.designdemo.chapter26.Context;

import java.util.Stack;


/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter27
 * @Author: xxd
 * @CreateTime: 2022-07-28  21:39
 * @Description: 客户类
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        Stack<Expression> stack = new Stack<>();
        for (;;){
            //进行语法判断，并产生递归调用
        }
//        Expression exp =  stack.pop();
//        exp.interpretter(context);
    }

}
