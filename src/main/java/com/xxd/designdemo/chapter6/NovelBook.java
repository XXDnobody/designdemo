package com.xxd.designdemo.chapter6;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter6
 * @Author: xxd
 * @CreateTime: 2022-07-17  22:27
 * @Description: TODO
 * @Version: 1.0
 */
public class NovelBook implements IBook{
    private String name;
    private int price;
    private String author;

    public NovelBook(String name, int price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getAuthor() {
        return this.author;
    }
}
