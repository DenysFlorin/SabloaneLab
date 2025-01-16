package model;

public class RealImage implements Element, Image {
    private final String url;

    public RealImage(String url) {
        this.url = url;
        loadImage();
    }

    @Override
    public void print() {
        System.out.println("models.Image: " + url);
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
        System.out.println("models.Image displaying image from: " + url);
    }

    private void loadImage() {
        System.out.println("models.Image loading image from: " + url);
    }
}
