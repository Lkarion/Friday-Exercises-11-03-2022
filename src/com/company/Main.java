package com.company;

public class Main {

    public static void main(String[] args) {
        // 1.Create a class named "Student" containing  variable String  'name' and  integer variable 'number'.
        //Assign the value of number =2 and value of name is "Petr" by creating an object of the class Student
        //Create two more objects of the class Student

        Student s1 = new Student("Petr", 1);
        Student s2 = new Student("Ivan", 2);
        Student s3 = new Student("Karl", 3);

        //2.Write a program to print perimenter of a triangle with sides 3,4,5 by creating a class 'Triangle' without
        // any parameter in constructor
        Triangle triangle = new Triangle();
        triangle.side1 = 4;
        triangle.side2 = 3;
        triangle.side3 = 2;
        System.out.println(triangle.getPerimeter());

        //3.Write a program to print area and  perimenter of a triangle with sides 3,4,5 by creating a
        // class 'Triangle' with constructor having the three sides as its parameters

        Triangle triangle1 = new Triangle(3,4,5);
        System.out.println("Perimeter is "+triangle1.getPerimeter());
        System.out.println("Area is "+triangle1.getArea());

        System.out.println();
        //4.Write a program to print the area and perimenter of a rectangle by creating a class named "Rectangle" .
        //Create methods getArea and getPerimenter to calculate area and perimenter in that class. Length and breadth
        // should be variables of the class passed via constructor. Create two objects with sides(4,5) and (5,8) and
        // calculate their perimenter and area

        Rectangle rectangle1 = new Rectangle(4,5);
        Rectangle rectangle2 = new Rectangle(5,8);
        System.out.println("Perimeter of rectangle1 is: "+rectangle1.getPerimeter());
        System.out.println("Area of rectangle1 is: "+rectangle1.getArea());
        System.out.println("Perimeter of rectangle2 is: "+rectangle2.getPerimeter());
        System.out.println("Area of rectangle2 is: "+rectangle2.getArea());

        System.out.println();
        //5. Print the average of three numbers by creating a class named "Average" having a method to calculate and
        // print the average. The class should have a constructor
        Average a = new Average(2,3,4);
        a.printAverage();

        System.out.println();
        //6, Write a program by creating an "Employee" class having the following methods and print the final salary.
        // - constructor which accepts the salary, numbers of employee's working hours  per day as parameters
        // - 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
        // - "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
        // more than 6 hours
        Employee ivan = new Employee(600, 8);
        ivan.addSalary();
        ivan.addWork();
        System.out.println(ivan.getSalary());

    }
}
