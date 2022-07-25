package com.xxd.designdemo.chapter19.demo2;

import java.util.Map;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter19.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-25  13:25
 * @Description: TODO
 * @Version: 1.0
 */
public class OuterUserInfo implements IUserInfo{
    private IOuterUserBaseInfo baseInfo = null;
    private IOuterUserHomeInfo homeInfo = null;
    private IOuterUserOfficeInfo officeInfo = null;

    private Map baseMap = null;
    private Map homeMap = null;
    private Map officeMap = null;

    //构造函数传递对象
    public OuterUserInfo(IOuterUserBaseInfo baseInfo, IOuterUserHomeInfo homeInfo, IOuterUserOfficeInfo officeInfo) {
        this.baseInfo = baseInfo;
        this.homeInfo = homeInfo;
        this.officeInfo = officeInfo;

        this.baseMap = this.baseInfo.getUserBaseInfo();
        this.homeMap = this.homeInfo.getUserHomeInfo();
        this.officeMap = this.officeInfo.getUserOfficeInfo();
    }

    @Override
    public String getUserName() {
        return null;
    }

    @Override
    public String getHomeAddress() {
        String homeAddress = (String)this.homeMap.get("homeAddress");
        System.out.println(homeAddress);
        return homeAddress;
    }

    @Override
    public String getMobileNumber() {
        String mobileNumber = (String)this.baseMap.get("mobileNumber");
        System.out.println(mobileNumber);
        return mobileNumber;
    }

    @Override
    public String getOfficeTelNumber() {
        return null;
    }

    @Override
    public String getJobPosition() {
        return null;
    }

    @Override
    public String getHomeTelNumber() {
        return null;
    }
}
