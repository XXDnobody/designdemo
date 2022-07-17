package com.xxd.designdemo.chapter6;

import java.text.NumberFormat;
import java.util.ArrayList;

/**
 * @BelongsProject: designdemo
 * @BelongsPackage: com.xxd.designdemo.chapter6
 * @Author: xxd
 * @CreateTime: 2022-07-17 22:28
 * @Description: 开闭原则
 * @Version: 1.0
 */
public class BookStore {
    private final static ArrayList<IBook> bookList = new ArrayList<>();

    static {
//        bookList.add(new NovelBook("天龙八部", 3200, "金庸"));
//        bookList.add(new NovelBook("巴黎圣母院", 5600, "雨果"));
//        bookList.add(new NovelBook("悲惨世界", 3500, "雨果"));
//        bookList.add(new NovelBook("金梅瓶", 4300, "嘿嘿"));

        bookList.add(new OffNovelBook("天龙八部", 3200, "金庸"));
        bookList.add(new OffNovelBook("巴黎圣母院", 5600, "雨果"));
        bookList.add(new OffNovelBook("悲惨世界", 3500, "雨果"));
        bookList.add(new OffNovelBook("金梅瓶", 4300, "嘿嘿"));
        bookList.add(new ComputerBook("ON JAVA",4300,"Bruce Eckel","JAVA"));
    }

    public static void main(String[] args) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        format.setMaximumFractionDigits(2);
        System.out.println("----------书店卖出去的书籍记录如下：------------");
        for (IBook iBook : bookList) {
            System.out.println("书籍名称:" + iBook.getName() + "\t书籍作者:" + iBook.getAuthor() + "\t:书籍价格"
                + format.format(iBook.getPrice() / 100.0));
        }
    }
}
