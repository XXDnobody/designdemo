package com.xxd.designdemo.chapter4;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter4
 * @Author: xxd
 * @CreateTime: 2022-07-17 21:09
 * @Description: TODO
 * @Version: 1.0
 */
public class PettyGirl implements IGoodBoyGril, IGreatTemperamentGirl {
    private String name;

    public PettyGirl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void goodLooking() {
        System.out.println(this.name + "----脸蛋真好看");
    }

    @Override
    public void niceFigure() {
        System.out.println(this.name + "----身材真棒啊");
    }

    @Override
    public void greatTemperament() {
        System.out.println(this.name + "----气质真好啊");
    }
}
