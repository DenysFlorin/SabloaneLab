package com.example.start1.services;

import lombok.Getter;

@Getter
abstract class AbstractStrategy implements AlignStrategy {
    protected int width;

    public AbstractStrategy(int width) {
        this.width = width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}

