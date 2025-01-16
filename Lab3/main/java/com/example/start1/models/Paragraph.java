package com.example.start1.models;

import com.example.start1.services.AStrategy;

public class Paragraph implements Element{
    private String text;
    private int width;
    private AStrategy strategy;

    public Paragraph(String text, int width, AStrategy strategy) {
        this.text = text;
        this.width = width;
        this.strategy = strategy;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    @Override
    public void add(Element element) {
        // Leaf models.Element, does nothing
    }

    @Override
    public void remove(Element element) {
        //Leaf models.Element, does nothing
    }

    @Override
    public Element get(int index) {
        return null; //Leaf models.Element, does nothing
    }

    public int getWidth() {
        return width;
    }

    public String getText() {
        return text;
    }

    public AStrategy getStrategy() {
        return strategy;
    }
}
