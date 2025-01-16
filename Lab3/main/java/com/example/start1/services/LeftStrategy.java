package com.example.start1.services;

import com.example.start1.models.Paragraph;

public class LeftStrategy implements Strategy {

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
                // Print the current line and start a new one
                System.out.println(line.toString().trim());
                line = new StringBuilder(word).append(" ");
            }
        }

        // Print any remaining text in the last line
        if (line.length() > 0) {
            System.out.println(line.toString().trim());
        }
    }
}
