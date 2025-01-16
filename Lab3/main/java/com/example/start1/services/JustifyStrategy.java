package com.example.start1.services;

import com.example.start1.models.Paragraph;

import java.util.ArrayList;
import java.util.List;

public class JustifyStrategy implements Strategy {

    @Override
    public void render(Paragraph paragraph) {
        int width = paragraph.getWidth();
        String text = paragraph.getText();
        String[] words = text.split(" ");

        StringBuilder line = new StringBuilder();
        List<String> lineWords = new ArrayList<>();

        for (String word : words) {
            // Check if adding this word would exceed the width
            if (line.length() + word.length() <= width) {
                lineWords.add(word);
                line.append(word).append(" ");
            } else {
                // Justify the current line and print it
                printJustified(lineWords, width);
                lineWords.clear();
                lineWords.add(word);
                line = new StringBuilder(word).append(" ");
            }
        }

        // Print the last line without justification
        if (!lineWords.isEmpty()) {
            System.out.println(String.join(" ", lineWords).trim());
        }
    }

    private void printJustified(List<String> words, int width) {
        if (words.size() == 1) {
            // If there's only one word, just left-align it
            System.out.println(words.get(0));
            return;
        }

        // Calculate total spaces needed and spaces between words
        int totalChars = words.stream().mapToInt(String::length).sum();
        int totalSpaces = width - totalChars;
        int spacesBetweenWords = totalSpaces / (words.size() - 1);
        int extraSpaces = totalSpaces % (words.size() - 1);

        StringBuilder justifiedLine = new StringBuilder();

        for (int i = 0; i < words.size(); i++) {
            justifiedLine.append(words.get(i));
            if (i < words.size() - 1) {
                // Add spaces between words
                justifiedLine.append(" ".repeat(spacesBetweenWords));
                if (extraSpaces > 0) {
                    justifiedLine.append(" ");
                    extraSpaces--;
                }
            }
        }

        System.out.println(justifiedLine.toString());
    }
}