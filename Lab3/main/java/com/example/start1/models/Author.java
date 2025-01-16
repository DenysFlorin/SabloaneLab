package com.example.start1.models;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("models.Author :" + this.name + " " + this.surname);
    }
}

