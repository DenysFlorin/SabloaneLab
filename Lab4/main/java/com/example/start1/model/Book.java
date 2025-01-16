package com.example.start1.model;

import java.util.ArrayList;
import java.util.List;

public class Book extends BaseElement {
    private final String title;
    private final List<Author> authors = new ArrayList<>();
    private final List<Element> elements = new ArrayList<>();

    public Book(String title) {
        this.title = title;
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    @Override
    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Authors: ");
        for (Author author : authors) {
            author.print();
        }
        System.out.println("Elements: ");
        for (Element element : elements) {
            element.print();
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

            // Set this Book as the parent of the child element
            baseElement.setParent(this);
        }
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        if (element instanceof BaseElement) {
            BaseElement baseElement = (BaseElement) element;

            // Clear the parent reference if this Book is the parent
            if (baseElement.getParent() == this) {
                baseElement.setParent(null);
            }
        }
        elements.remove(element);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }
}
