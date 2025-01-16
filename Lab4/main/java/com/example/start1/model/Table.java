package com.example.start1.model;

public class Table extends LeafElement  {
    private final String data;

    public Table(String data) {
        this.data = data;
    }

    @Override
    public void print() {
        System.out.println("models.Table: " + data);
    }

    @Override
    public Element get(int index) {
        return null;
    }
}
