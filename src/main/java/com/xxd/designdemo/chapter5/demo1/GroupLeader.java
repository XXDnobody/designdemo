package com.xxd.designdemo.chapter5.demo1;

import java.util.List;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter5.demo1
 * @Author: xxd
 * @CreateTime: 2022-07-17 21:41
 * @Description: TODO
 * @Version: 1.0
 */
public class GroupLeader {
    private List<Girl> listGirls;

    public GroupLeader(List<Girl> listGirls) {
        this.listGirls = listGirls;
    }

    public void countGirls() {
        System.out.println("女生数量是：" + this.listGirls.size());
    }
}
