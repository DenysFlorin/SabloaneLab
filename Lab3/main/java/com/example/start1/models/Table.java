package com.example.start1.models;

public class Table implements Element {
    private String data;

    public Table(String data) {
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println("models.Table: " + data);
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
