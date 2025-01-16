package com.example.start1.services;

import java.util.ArrayList;
import java.util.List;

public class JustifyStrategy extends AbstractStrategy {
    JustifyStrategy(int width) {
        super(width);
    }

    @Override
    public void render(String text) {
        String[] words = text.split(" ");
        StringBuilder line = new StringBuilder();
        List<String> lineWords = new ArrayList<>();

        for (String word : words) {
            if (line.length() + word.length() <= width) {
                lineWords.add(word);
                line.append(word).append(" ");
            } else {
                printJustified(lineWords, width);
                lineWords.clear();
                lineWords.add(word);
                line = new StringBuilder(word).append(" ");
            }
        }

        if (!lineWords.isEmpty()) {
            System.out.println(String.join(" ", lineWords).trim());
        }
    }

    private void printJustified(List<String> words, int width) {
        if (words.size() == 1) {
            System.out.println(words.getFirst());
            return;
        }

        int totalChars = words.stream().mapToInt(String::length).sum();
        int totalSpaces = width - totalChars;
        int spacesBetweenWords = totalSpaces / (words.size() - 1);
        StringBuilder justifiedLine = getStringBuilder(words, totalSpaces, spacesBetweenWords);

        System.out.println(justifiedLine.toString());
    }

    private static StringBuilder getStringBuilder(List<String> words, int totalSpaces, int spacesBetweenWords) {
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
        return justifiedLine;
    }
}