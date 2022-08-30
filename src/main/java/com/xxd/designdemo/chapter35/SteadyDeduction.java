package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30 16:32
 * @Description: 扣款策略一
 * @Version: 1.0
 */
public class SteadyDeduction implements IDeduction {
    // 固定性交易扣款
    @Override
    public boolean exec(Card card, Trade trade) {
        // 固定金额和自由金额各扣除50%
        int halfMoney = (int)Math.rint(trade.getAmount() / 2.0);
        card.setFreeMoney(card.getFreeMoney() - halfMoney);
        card.setSteadyMoney(card.getSteadyMoney() - halfMoney);
        return true;
    }
}
