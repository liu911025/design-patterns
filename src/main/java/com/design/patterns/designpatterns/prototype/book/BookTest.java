package com.design.patterns.designpatterns.prototype.book;

public class BookTest {

    public static void main(String[] args) {
        /** 原版 */
        Book book = new Book("月亮与六便士", "毛姆", "小说", "小说");
        /** 复制十本 */
        for (int i = 1; i <= 10; i++) {
            Book book1 = (Book) book.clone();
            System.out.println("复制第" + i + "本<<" + book1.getName() + ">>");
        }
    }

}
