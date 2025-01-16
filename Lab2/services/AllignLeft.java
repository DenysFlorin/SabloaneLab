package services;

public class AllignLeft extends AbstractStrategy {
    public AllignLeft(int width) {
        super(width);
    }

    @Override
    public void render(String text) {
        String[] words = text.split(" ");

        StringBuilder line = new StringBuilder();

        for (String word : words) {
            if (line.length() + word.length() <= width) {
                line.append(word).append(" ");
            }
            else {
                System.out.println(line.toString().trim());
                line = new StringBuilder(word).append(" ");
            }
        }

        if (!line.isEmpty()) {
            System.out.println(line.toString().trim());
        }
    }
}
