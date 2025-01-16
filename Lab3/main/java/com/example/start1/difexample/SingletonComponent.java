package com.example.start1.difexample;

import org.springframework.stereotype.Component;

@Component
public class SingletonComponent {
    public SingletonComponent() {
        System.out.println("SingletonComponent::SingletonComponent = " + this);
    }
    public void operation() {
        System.out.println("SingletonComponent::operation() on " + this);
    }
}
