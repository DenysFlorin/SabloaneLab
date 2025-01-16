package model;

import services.AlignStrategy;

public class Paragraph implements Element{
    private final String text;

    public Paragraph(String text) {
        this.text = text;
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
