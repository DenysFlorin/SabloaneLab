package com.example.start1.services;

public class AllignRight extends AbstractStrategy {

    public AllignRight(int width) {
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
                printRightAligned(line.toString().trim());
                line = new StringBuilder(word).append(" ");
            }
        }
        if (!line.isEmpty()) {
            printRightAligned(line.toString().trim());
        }
    }

    private void printRightAligned(String line) {
        int padding = width - line.length();
        String paddingSpaces = " ".repeat(Math.max(0, padding));

        System.out.println(paddingSpaces + line);
    }
}
