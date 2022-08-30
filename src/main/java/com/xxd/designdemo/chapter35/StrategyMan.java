package com.xxd.designdemo.chapter35;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter35
 * @Author: xxd
 * @CreateTime: 2022-07-30  16:39
 * @Description: 策略枚举
 * @Version: 1.0
 */
public enum StrategyMan {
    SteadyDeduction("com.xxd.designdemo.chapter35.SteadyDeduction"),
    FreeDeduction("com.xxd.designdemo.chapter35.FreeDeduction");

    StrategyMan(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    String value = "";

}
