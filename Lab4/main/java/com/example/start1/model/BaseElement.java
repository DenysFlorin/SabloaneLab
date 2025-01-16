package com.example.start1.model;

import lombok.Getter;

@Getter
public abstract class BaseElement implements Element {
    private Element parent;

    protected void setParent(Element parent) {
        this.parent = parent;
    }

    protected boolean hasParent() {
        return parent != null;
    }
}
