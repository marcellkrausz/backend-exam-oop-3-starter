package com.codecool;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import cccr.CCCRTestExecutionListener;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith({CCCRTestExecutionListener.class})
class ShapeListTest {

    @Test
    void getLargest_emptyList_returnsNull() {
        ShapeList shapeList = new ShapeList();

        assertNull(shapeList.getLargest());
    }

    @Test
    void getLargest_listHasShapes_returnsLargestAreaShape() {
        ShapeList shapeList = new ShapeList();

        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Triangle triangle = new Triangle(6, 6);
        Rectangle rectangle1 = new Rectangle(2, 2);

        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(triangle);
        shapeList.add(rectangle1);

        assertEquals(square, shapeList.getLargest());
    }

    @Test
    void getLargest_listHasTwoLargestShapes_returnsFirstLargestShape() {
        ShapeList shapeList = new ShapeList();

        Triangle triangle = new Triangle(10, 5);
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(4, 5);
        Rectangle rectangle1 = new Rectangle(2, 2);

        shapeList.add(triangle);
        shapeList.add(square);
        shapeList.add(rectangle);
        shapeList.add(rectangle1);

        assertEquals(triangle, shapeList.getLargest());
    }

    @Test
    void compareArea_squareIsLargest_returnsSquareString() {
        ShapeList shapeList = new ShapeList();

        Square square = new Square(3);
        Rectangle rectangle = new Rectangle(2, 2);

        assertEquals("I'm a square", shapeList.compareArea(square, rectangle));
    }

    @Test
    void compareArea_rectangleIsLargest_returnsRectangleString() {
        ShapeList shapeList = new ShapeList();

        Rectangle rectangle = new Rectangle(4, 4);
        Square square = new Square(3);

        assertEquals("I'm a rectangle", shapeList.compareArea(square, rectangle));
    }

    @Test
    void compareArea_triangleIsLargest_returnsTriangleString() {
        ShapeList shapeList = new ShapeList();

        Triangle triangle = new Triangle(5, 4);
        Square square = new Square(3);

        assertEquals("I'm a triangle", shapeList.compareArea(triangle, square));
    }

    @Test
    void compareArea_shapesHaveEqualArea_returnsEqualString() {
        ShapeList shapeList = new ShapeList();

        Triangle triangle = new Triangle(5, 4);
        Rectangle rectangle = new Rectangle(2, 5);

        assertEquals("Equal areas", shapeList.compareArea(triangle, rectangle));
    }
}