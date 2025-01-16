package com.example.start1.models;

public class Image implements Element {
    private String url;

    public Image(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("models.Image: " + url);
    }

    @Override
    public void add(Element element) {
        //Leaf, does nothing
    }

    @Override
    public void remove(Element element) {
        //Leaf, does nothing
    }

    @Override
    public Element get(int index) {
        return null;
    }
}
