package model;

public class Author {
    private final String name;
    private final String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void print() {
        System.out.println("models.Author :" + this.name + " " + this.surname);
    }
}
