package com.example.start1.model;

public class TableOfContents extends LeafElement {
    private String title;
    private String content;
    public TableOfContents(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("models.Table Of Contents" + title + "\n" + content);
    }


    @Override
    public Element get(int index) {
        return null;
    }
}

