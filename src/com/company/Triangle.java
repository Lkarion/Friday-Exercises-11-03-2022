package com.company;

public class Triangle {
    int side1,side2,side3;

    public Triangle() {
    }

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public int getPerimeter() {
        return side1+side2+side3;
    }

    public double getArea() {
        double p = getPerimeter()/2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }


}
