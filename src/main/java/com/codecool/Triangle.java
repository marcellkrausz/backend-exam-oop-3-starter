package com.codecool;

public class Triangle extends Shape {
    private int base;
    private int baseHeight;

    public Triangle(int base, int baseHeight) {
        this.base = base;
        this.baseHeight = baseHeight;
    }

    @Override
    public int getArea() {
        return base * baseHeight / 2;
    }

    @Override
    public String speak() {
        return "I'm a triangle";
    }
}
