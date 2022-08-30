package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30 16:35
 * @Description: 扣款策略二
 * @Version: 1.0
 */
public class FreeDeduction implements IDeduction {
    // 直接从自由余额中扣除
    @Override
    public boolean exec(Card card, Trade trade) {
        card.setFreeMoney(card.getFreeMoney() - trade.getAmount());
        return true;
    }
}
