package model;

public class TableOfContents implements Element{
    private String title;
    private String content;
    public TableOfContents(String title, String content) {
        this.title = title;
        this.content = content;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println("models.Table Of Contents" + title + "\n" + content);
    }

    @Override
    public void add(Element element) {
        // Leaf, does nothing
    }

    @Override
    public void remove(Element element) {
        // Leaf, does nothing
    }

    @Override
    public Element get(int index) {
        return null;
    }
}

