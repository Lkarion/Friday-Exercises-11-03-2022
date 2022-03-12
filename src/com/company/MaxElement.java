package com.company;

public class MaxElement {
    //Create a class, which will have a method to find max element of int array.
    // The class must have a constructor accepting int array.
    int[] array;

    public MaxElement(int[] array) {
        this.array = array;
    }

    public int findMax(){
        int max = Integer.MIN_VALUE;
        for (int i: this.array) {
            if (max < i) max = i;
        }
        return max;
    }
}
