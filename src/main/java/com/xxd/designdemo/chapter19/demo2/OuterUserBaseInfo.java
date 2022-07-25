package com.xxd.designdemo.chapter19.demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter19.demo2
 * @Author: xxd
 * @CreateTime: 2022-07-25  13:20
 * @Description: 用户基本信息
 * @Version: 1.0
 */
public class OuterUserBaseInfo implements IOuterUserBaseInfo{
    @Override
    public Map getUserBaseInfo() {
        HashMap baseInfoMap = new HashMap();
        baseInfoMap.put("username","员工小李");
        baseInfoMap.put("mobileNumber","电话号码是120");
        return baseInfoMap;
    }
}
