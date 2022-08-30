package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30  16:45
 * @Description: 扣款模块封装
 * @Version: 1.0
 */
public class DeductionFacade {
    //对外公布的扣款信息
    public static Card deduct(Card card,Trade trade){
        //获得消费策略
        StrategyMan reg = getDeductionType(trade);
        //初始化一个消费策略对象
        IDeduction deduction = StrategyFactory.getDeduction(reg);
        //产生一个策略上下文
        DeductionContext context = new DeductionContext(deduction);
        //进行扣款处理
        context.exec(card,trade);
        //返回扣款处理完毕后的数据
        return card;
    }

    private static StrategyMan getDeductionType(Trade trade) {
        if(trade.getTradeNo().contains("abc")){
            return StrategyMan.FreeDeduction;
        }else {
            return StrategyMan.SteadyDeduction;
        }
    }
}
