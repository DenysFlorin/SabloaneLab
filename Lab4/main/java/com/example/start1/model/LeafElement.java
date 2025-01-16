package com.example.start1.model;

public abstract class LeafElement extends BaseElement {
    @Override
    public void add(Element element) {
        throw new UnsupportedOperationException("Leaf elements cannot contain children.");
    }

    @Override
    public void remove(Element element) {
        throw new UnsupportedOperationException("Leaf elements cannot contain children.");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Leaf elements do not have children.");
    }
}
