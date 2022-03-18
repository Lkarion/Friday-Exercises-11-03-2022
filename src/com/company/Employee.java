package com.company;

public class Employee {
    //6, Write a program by creating an "Employee" class having the following methods and print the final salary.
    // - constructor which accepts the salary, numbers of employee's working hours  per day as parameters
    // - 'addSalary()' method which adds $10 to the salary of the employee if it is less than $500
    // - "addWork()" method which adds $5 to the employee's salary if the number of working hours per day is
    // more than 6 hours
    int salary;
    int hours;

    public Employee(int salary, int hours) {
        this.salary = salary;
        this.hours = hours;
    }

    public void addSalary(){
        if (salary < 500) salary+=10;
    }

    public void addWork(){
        if (hours > 6) salary+=5;
    }

    public int getSalary() {
        return salary;
    }
}
