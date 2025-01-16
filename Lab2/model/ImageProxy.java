package model;

public class ImageProxy implements Image, Element {
    private RealImage realImage;
    private String url;


    @Override
    public void print() {
        System.out.println("models.ImageProxy: " + url);
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

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(url);
        }
        realImage.display();
    }
}
