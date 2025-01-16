package com.example.start1.model;

public class RealImage extends LeafElement implements Image {
    private final String url;

    public RealImage(String url) {
        this.url = url;
        loadImage();
    }

    @Override
    public void display() {
        System.out.println("Displaying image from: " + url);
    }

    private void loadImage() {
        System.out.println("Loading image from: " + url);
    }

    @Override
    public void print() {
        System.out.println("Printing image from: " + url);
    }
}
