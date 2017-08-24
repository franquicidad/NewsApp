package com.example.mac.newsapp;

/**
 * Created by mac on 23/08/17.
 */

public class News {


    private String SectionName;
    private String Title;
    private String author;
    private String publishedDate;
    private String imageLink;

    public News(String sectionName, String title, String author, String publishedDate,String imageLink) {
        SectionName = sectionName;
        Title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.imageLink=imageLink;
    }

    public String getSectionName() {
        return SectionName;
    }

    public void setSectionName(String sectionName) {
        SectionName = sectionName;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }
}
