package com.design.patterns.designpatterns.prototype.book;

/**
 * 原型模式
 */
public class Book implements Cloneable {

    private String name;
    private String author;
    private String type;
    private String content;

    public Book (String name, String author, String type, String content) {
        this.name = name;
        this.author = author;
        this.type = type;
        this.content = content;
        System.out.println("实例化书籍：" + this.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("复制书籍失败!");
            e.printStackTrace();
        }
        return null;
    }

}
