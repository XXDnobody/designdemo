package com.xxd.designdemo.chapter6;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter6
 * @Author: xxd
 * @CreateTime: 2022-07-17 22:34
 * @Description: TODO
 * @Version: 1.0
 */
public class OffNovelBook extends NovelBook {

    public OffNovelBook(String name, int price, String author) {
        super(name, price, author);
    }

    @Override
    public int getPrice() {
        // 原价
        int price = super.getPrice();
        int offPrice = 0;

        if (price > 4000) {
            offPrice = price * 90 / 100;
        } else {
            offPrice = price * 80 / 100;
        }
        return offPrice;
    }
}
