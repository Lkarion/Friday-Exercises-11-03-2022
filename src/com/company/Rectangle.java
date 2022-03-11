package com.company;

public class Rectangle {
    int length, breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getPerimeter() {
        return 2*length+2*breadth;
    }

    public int getArea() {
        return length*breadth;
    }
}
