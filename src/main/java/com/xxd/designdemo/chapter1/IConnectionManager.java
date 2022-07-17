package com.xxd.designdemo.chapter1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter1
 * @Author: xxd
 * @CreateTime: 2022-07-14  23:55
 * @Description: TODO
 * @Version: 1.0
 */
public interface IConnectionManager {
    /**
     * @description:
     * @author: xxd
     * @date: 2022/7/14 23:55
     * @param: [phoneNumber]
     * @return: [java.lang.String]
     **/
    void dial(String phoneNumber);

    /**
     * @description:
     * @author: xxd
     * @date: 2022/7/14 23:55
     * @param: []
     * @return: []
     **/
    void hangup();
}
