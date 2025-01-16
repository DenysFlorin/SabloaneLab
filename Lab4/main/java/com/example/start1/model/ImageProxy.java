package com.example.start1.model;

public class ImageProxy extends LeafElement implements Image {
    private RealImage realImage;
    private final String url;

    public ImageProxy(String url) {
        this.url = url;
    }

    @Override
    public void print() {
        System.out.println("ImageProxy: " + url);
    }

    @Override
    public void display() {
        // Lazy initialization of the real image
        if (realImage == null) {
            realImage = new RealImage(url);
        }
        realImage.display();
    }
}
