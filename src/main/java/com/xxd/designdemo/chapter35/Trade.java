package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30 16:30
 * @Description: 交易类
 * @Version: 1.0
 */
public class Trade {
    // 交易编号
    private String tradeNo = "";
    // 交易金额
    private int amount = 0;

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
