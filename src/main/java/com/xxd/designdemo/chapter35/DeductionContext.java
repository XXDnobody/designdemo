package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30 16:37
 * @Description: 扣款策略的封装
 * @Version: 1.0
 */
public class DeductionContext {
    // 扣款策略
    private IDeduction deduction = null;

    // 构造函数传递策略
    public DeductionContext(IDeduction deduction) {
        this.deduction = deduction;
    }

    // 进行扣款
    public boolean exec(Card card, Trade trade) {
        return this.deduction.exec(card, trade);
    }
}
