package services;

public class CenterStrategy extends AbstractStrategy {
    public CenterStrategy(int width) {
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
                printCenterAligned(line.toString().trim());
                line = new StringBuilder(word).append(" ");
            }
        }

        if (!line.isEmpty()) {
           printCenterAligned(line.toString().trim());
        }

    }

    private void printCenterAligned(String line) {
        int totalPadding = width - line.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;

        String paddingLeft = " ".repeat(Math.max(0, leftPadding));
        String paddingRight = " ".repeat(Math.max(0, rightPadding));

        System.out.println(paddingLeft + line + paddingRight);
    }
}
