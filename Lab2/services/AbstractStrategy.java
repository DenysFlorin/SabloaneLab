package services;

abstract class AbstractStrategy implements AlignStrategy {
    protected int width;

    public AbstractStrategy(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

