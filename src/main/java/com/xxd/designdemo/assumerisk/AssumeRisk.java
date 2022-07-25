package com.xxd.designdemo.assumerisk;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.assumerisk
 * @Author: xxd
 * @CreateTime: 2022-07-17  23:36
 * @Description: TODO
 * @Version: 1.0
 */
public class AssumeRisk extends AbstractAssumeRisk{


    public AssumeRisk(AbstractAssumeRiskCal assumeRiskCal) {
        super(assumeRiskCal);
    }

    @Override
    public void show() {
        super.assumeRiskCal.combination();
    }
}
