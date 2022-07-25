package com.xxd.designdemo.chapter19.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter19.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-25  13:21
 * @Description: 用户家庭信息
 * @Version: 1.0
 */
public class OuterUserHomeInfo implements IOuterUserHomeInfo{
    @Override
    public Map getUserHomeInfo() {
        HashMap homeInfo = new HashMap();
        homeInfo.put("homeTelNumber","员工家庭电话是。。。");
        homeInfo.put("homeAddress","员工家庭地址是。。。。");
        return homeInfo;
    }
}
