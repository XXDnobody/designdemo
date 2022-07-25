package com.xxd.designdemo.chapter19.demo2;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter19.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-25 21:18
 * @Description: 适配器模式（对象适配器）
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        OuterUserBaseInfo outerUserBaseInfo = new OuterUserBaseInfo();
        OuterUserHomeInfo outerUserHomeInfo = new OuterUserHomeInfo();
        OuterUserOfficeInfo outerUserOfficeInfo = new OuterUserOfficeInfo();
        OuterUserInfo outerUserInfo = new OuterUserInfo(outerUserBaseInfo, outerUserHomeInfo, outerUserOfficeInfo);
        for (int i = 0; i < 101; i++) {
            outerUserInfo.getMobileNumber();
        }

    }
}
