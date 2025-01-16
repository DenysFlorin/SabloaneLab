package com.example.start1.model;

import com.example.start1.services.AlignStrategy;

public class Paragraph extends LeafElement{
    private final String text;

    public Paragraph(String text) {
        this.text = text;
    }

    @Override
    public void print() {
        System.out.println(text);
    }

    @Override
    public Element get(int index) {
        return null; //Leaf models.Element, does nothing
    }

    public String getText() {
        return text;
    }

    public void render(AlignStrategy alignStrategy) {
        if (alignStrategy != null) {
            alignStrategy.render(text);
        }
        else {
            print();
        }
    }
}
