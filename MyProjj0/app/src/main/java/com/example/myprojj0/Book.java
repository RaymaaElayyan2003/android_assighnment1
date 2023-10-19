package com.example.myprojj0;
//building fake class-as database- for storing data and get em from here
public class Book {
    private String title;
    private String author;
    private String category;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Book(){}

    public Book(String title, String author,String category ) {
        this.title = title;
        this.author = author;
        this.category=  category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
