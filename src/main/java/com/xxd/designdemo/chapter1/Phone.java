package com.xxd.designdemo.chapter1;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter1
 * @Author: xxd
 * @CreateTime: 2022-07-14  23:54
 * @Description: 单一职责：接口一定要做到单一职责，类的设计尽量做到只有一个原因引起变化
 * @Version: 1.0
 */
public class Phone implements IConnectionManager,IDataTransfer{

    @Override
    public void dial(String phoneNumber) {

    }

    @Override
    public void hangup() {

    }

    @Override
    public void DataTransferer(IConnectionManager cm) {

    }
}
