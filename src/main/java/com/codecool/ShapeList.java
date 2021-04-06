package com.codecool;

import java.util.ArrayList;
import java.util.List;

public class ShapeList {
    private List<Shape> shapeList = new ArrayList<>();

    public void add(Shape shape) {
        shapeList.add(shape);
    }

    public Shape getLargest() {
        int maxArea = 0;
        Shape shape1 = null;
        for (Shape shape : shapeList) {
            if (shape.getArea() > maxArea) {
                maxArea = shape.getArea();
                shape1 = shape;
            }
        }
        return shape1;
    }

    public String compareArea(Shape shape1, Shape shape2) {
        if (shape1.getArea() > shape2.getArea()) {
            return shape1.speak();
        } else if (shape1.getArea() < shape2.getArea()) {
            return shape2.speak();
        } else {
            return "Equal areas";
        }
    }
}
