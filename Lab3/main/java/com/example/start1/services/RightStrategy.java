package com.example.start1.services;

import com.example.start1.models.Paragraph;

public class RightStrategy implements Strategy {

    @Override
    public void render(Paragraph paragraph) {
        int width = paragraph.getWidth();
        String text = paragraph.getText();
        String[] words = text.split(" ");

        StringBuilder line = new StringBuilder();
        for (String word : words) {
            if (line.length() + word.length() <= width) {
                line.append(word).append(" ");
            }
            else {
                printRightAligned(line.toString().trim(), width);
                line = new StringBuilder(word).append(" ");
            }
        }

        // Print any remaining text in the last line
        if (line.length() > 0) {
            printRightAligned(line.toString().trim(), width);
        }
    }

    private void printRightAligned(String line, int width) {
        // Calculate the padding required to align the text to the right
        int padding = width - line.length();
        String paddingSpaces = " ".repeat(Math.max(0, padding));

        // Print the line with padding at the beginning
        System.out.println(paddingSpaces + line);
    }
}
