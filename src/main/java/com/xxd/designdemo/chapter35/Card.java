package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30  16:27
 * @Description: IC卡类
 * @Version: 1.0
 */
public class Card {
    //IC卡号码
    private String cardNo = "";
    //卡内 的固定交易金额
    private int steadyMoney = 0;
    //卡内自由交易金额
    private int freeMoney = 0;

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public int getSteadyMoney() {
        return steadyMoney;
    }

    public void setSteadyMoney(int steadyMoney) {
        this.steadyMoney = steadyMoney;
    }

    public int getFreeMoney() {
        return freeMoney;
    }

    public void setFreeMoney(int freeMoney) {
        this.freeMoney = freeMoney;
    }
}
