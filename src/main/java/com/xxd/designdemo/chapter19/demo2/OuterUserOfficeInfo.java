package com.xxd.designdemo.chapter19.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter19.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-25  13:23
 * @Description: 用户工作信息
 * @Version: 1.0
 */
public class OuterUserOfficeInfo implements IOuterUserOfficeInfo{
    @Override
    public Map getUserOfficeInfo() {
        HashMap officeInfo = new HashMap();
        officeInfo.put("jobPosition","这个人的职位是BOSS");
        officeInfo.put("officeTelNumber","员工的办公电话是..");
        return officeInfo;
    }
}
