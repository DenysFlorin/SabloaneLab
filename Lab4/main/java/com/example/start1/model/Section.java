package com.example.start1.model;

import java.util.ArrayList;
import java.util.List;

public class Section extends BaseElement {
    private final String title;
    private final List<Element> children = new ArrayList<>();

    public Section(String title) {
        this.title = title;
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element child : children) {
            child.print();
        }
    }

    @Override
    public void add(Element element) {
        if (element instanceof BaseElement) {
            BaseElement baseElement = (BaseElement) element;

            // Check if the element already has a parent
            if (baseElement.hasParent()) {
                throw new IllegalStateException("Element already has a parent and cannot be added to another.");
            }

            // Set this Section as the parent of the child element
            baseElement.setParent(this);
        }
        children.add(element);
    }

    @Override
    public void remove(Element element) {
        if (element instanceof BaseElement) {
            BaseElement baseElement = (BaseElement) element;

            // Clear the parent reference if this Section is the parent
            if (baseElement.getParent() == this) {
                baseElement.setParent(null);
            }
        }
        children.remove(element);
    }

    @Override
    public Element get(int index) {
        return children.get(index);
    }
}
