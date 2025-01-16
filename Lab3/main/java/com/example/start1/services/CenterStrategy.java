package com.example.start1.services;

import com.example.start1.models.Paragraph;

public class CenterStrategy implements Strategy {

    @Override
    public void render(Paragraph paragraph) {
        int width = paragraph.getWidth();
        String text = paragraph.getText();
        String[] words = text.split(" ");

        StringBuilder line = new StringBuilder();

        for (String word : words) {
            // Check if adding this word would exceed the width
            if (line.length() + word.length() <= width) {
                line.append(word).append(" ");
            } else {
                // Center-align the current line and print it
                printCenterAligned(line.toString().trim(), width);
                line = new StringBuilder(word).append(" ");
            }
        }

        // Print any remaining text in the last line
        if (line.length() > 0) {
            printCenterAligned(line.toString().trim(), width);
        }
    }

    private void printCenterAligned(String line, int width) {
        // Calculate padding required to center the text
        int totalPadding = width - line.length();
        int leftPadding = totalPadding / 2;
        int rightPadding = totalPadding - leftPadding;

        // Create padding spaces for both sides
        String paddingLeft = " ".repeat(Math.max(0, leftPadding));
        String paddingRight = " ".repeat(Math.max(0, rightPadding));

        // Print the centered line
        System.out.println(paddingLeft + line + paddingRight);
    }
}