package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30 16:43
 * @Description: 策略工厂
 * @Version: 1.0
 */
public class StrategyFactory {
    //策略工厂
    public static IDeduction getDeduction(StrategyMan strategyMan){
        IDeduction deduction = null;
        try{
            deduction = (IDeduction) Class.forName(strategyMan.getValue()).newInstance();
        }catch (Exception e){

        }
        return deduction;
    }
}
