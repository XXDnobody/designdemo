package com.xxd.designdemo.assumerisk;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.assumerisk
 * @Author: xxd
 * @CreateTime: 2022-07-17  23:17
 * @Description: TODO
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        boolean isPirce = true;
        AdjustAssumeRisk adjustAssumeRisk = new AdjustAssumeRisk();
        PriceAssumeRisk priceAssumeRisk = new PriceAssumeRisk();
        AssumeRisk assumeRisk;
        if(isPirce){
            assumeRisk = new AssumeRisk(priceAssumeRisk);
        }else{
            assumeRisk = new AssumeRisk(adjustAssumeRisk);
        }
        assumeRisk.show();

    }
}
