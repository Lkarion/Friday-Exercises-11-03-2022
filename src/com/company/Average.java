package com.company;

public class Average {
    int n1,n2,n3;

    public Average(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void printAverage(){
        System.out.println("Average of "+n1+", "+n2+" and "+n3+" = "+(n1+n2+n3)/3);
    }
}
