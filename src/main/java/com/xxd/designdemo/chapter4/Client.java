package com.xxd.designdemo.chapter4;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter4
 * @Author: xxd
 * @CreateTime: 2022-07-17 21:18
 * @Description: 接口隔离原则
 * @Version: 1.0
 */
public class Client {
    public static void main(String[] args) {
        PettyGirl pettyGirl = new PettyGirl("SS");
        AbstractSearcher searcher = new Searcher(pettyGirl);
        searcher.show();
    }
}
