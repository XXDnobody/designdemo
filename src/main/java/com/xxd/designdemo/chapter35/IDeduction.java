package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30 16:31
 * @Description: 扣款策略接口
 * @Version: 1.0
 */
public interface IDeduction {
    // 扣款，提供交易和卡信息，进行扣款，并返回扣款是否成功
    public boolean exec(Card card, Trade trade);
}
