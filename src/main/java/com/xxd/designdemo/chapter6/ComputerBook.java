package com.xxd.designdemo.chapter6;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter6
 * @Author: xxd
 * @CreateTime: 2022-07-17  22:41
 * @Description: TODO
 * @Version: 1.0
 */
public class ComputerBook implements IComputerBook{
    private String name;
    private int price;
    private String author;
    private String scope;

    public ComputerBook(String name, int price, String author, String scope) {
        this.name = name;
        this.price = price;
        this.author = author;
        this.scope = scope;
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

    @Override
    public String getScope() {
        return this.scope;
    }
}
