package com.xxd.designdemo.chapter4;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter4
 * @Author: xxd
 * @CreateTime: 2022-07-17  21:16
 * @Description: TODO
 * @Version: 1.0
 */
public class Searcher extends AbstractSearcher{

    public Searcher(PettyGirl pettyGirl) {
        super(pettyGirl);
    }

    @Override
    public void show() {
        System.out.println("美女信息如下：---------------");
        super.pettyGirl.goodLooking();
        super.pettyGirl.niceFigure();
        super.pettyGirl.greatTemperament();
    }
}
